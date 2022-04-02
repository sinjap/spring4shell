package com.example.spring4shell.controller;

import com.example.spring4shell.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Controller
public class HelloWorldController {

    @RequestMapping({ "/", "/helloworld" })
    public String handler(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("model=" + model);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "helloworld";
    }

    @GetMapping({ "/test"})
    @ResponseBody
    public String get_test(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("model=" + model);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "helloworld";
    }

    @PostMapping({ "/test"})
    @ResponseBody
    public String post_test(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("model=" + model);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "helloworld";
    }
}
