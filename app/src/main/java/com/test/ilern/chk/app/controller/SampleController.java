package com.test.ilern.chk.app.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SampleController.class);
//    }
//    public static void main(String[] args) {
//        SpringApplication.run(SampleController.class, args);
//    }

    @RequestMapping(value = "/sample")
    public String hello() {
        return "Hello World from Tomcat";
    }
}

//@SpringBootApplication
//@RestController
//public class SampleController extends SpringBootServletInitializer {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SampleController.class);
//    }
//    public static void main(String[] args) {
//        SpringApplication.run(SampleController.class, args);
//    }
//
//    @RequestMapping(value = "/sample")
//    public String hello() {
//        return "Hello World from Tomcat";
//    }
//}

