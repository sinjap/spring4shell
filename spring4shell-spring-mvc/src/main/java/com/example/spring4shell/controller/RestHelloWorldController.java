package com.example.spring4shell.controller;

import com.example.spring4shell.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
/**
 * RestControllers are <b>equally vulnerable</b>, this did not come out out of the CVE publication by Spring.
 */
@RestController
public class RestHelloWorldController {

    @RequestMapping({ "/rest/", "/rest/request" })
    public String doRequest(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("model=" + model);
        helloWorld.setEndpoint("/rest/request");
        helloWorld.setIsVulnerable(true);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "request";
    }

    @GetMapping({ "/rest/get"})
    @ResponseBody
    public String dotGet(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("model=" + model);
        helloWorld.setEndpoint("/rest/get");
        helloWorld.setIsVulnerable(false);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "request";
    }

    @PostMapping({ "/rest/post"})
    @ResponseBody
    public String doPost(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("model=" + model);
        helloWorld.setEndpoint("/rest/post");
        helloWorld.setIsVulnerable(true);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "request";
    }

    @PutMapping({ "/rest/put"})
    @ResponseBody
    public String doPut(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("model=" + model);
        helloWorld.setEndpoint("/rest/put");
        helloWorld.setIsVulnerable(false);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "request";
    }
}
