package com.example.spring4shell.boot.war;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.OffsetDateTime;

@Controller
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping({ "/", "/helloworld", "spring4shell/helloworld" })
    public String index(Model model) {
        logger.info("model = {}", model);
        model.addAttribute("model", String.valueOf(model));
        model.addAttribute("time", OffsetDateTime.now().toString());
        return "helloworld";
    }

    @GetMapping({ "/test"})
    @ResponseBody
    public String get_test(Model model) {
        logger.info("model = {}", model);
        model.addAttribute("model", String.valueOf(model));
        model.addAttribute("time", OffsetDateTime.now().toString());
        return "helloworld";
    }

    @PostMapping({ "/test"})
    @ResponseBody
    public String post_test(Model model) {
        logger.info("model = {}", model);
        model.addAttribute("model", String.valueOf(model));
        model.addAttribute("time", OffsetDateTime.now().toString());
        return "helloworld";
    }

}
