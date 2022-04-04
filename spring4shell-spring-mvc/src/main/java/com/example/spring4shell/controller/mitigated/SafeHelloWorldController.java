package com.example.spring4shell.controller.mitigated;

import com.example.spring4shell.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class SafeHelloWorldController {

    @RequestMapping("/safe-request")
    public String handler(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
        helloWorld.setEndpoint("/safe-request");
        helloWorld.setIsVulnerable(false);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "request";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // This code protects Spring Core from a "Remote Code Execution" attack (dubbed "Spring4Shell").
        // By applying this mitigation, you prevent the "Class Loader Manipulation" attack vector from firing.
        // For more details, see this post: https://www.lunasec.io/docs/blog/spring-rce-vulnerabilities/
        String[] blackList = { "class.*", "Class.*", "*.class.*", ".*Class.*" };
        binder.setDisallowedFields(blackList);
    }
}
