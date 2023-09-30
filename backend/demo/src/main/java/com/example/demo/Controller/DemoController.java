package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Demo;
import com.example.demo.Service.DemoService;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping(value = "/hello")
    public String getHelloMessage() {
        return demoService.getHelloMessage();
    }
}
