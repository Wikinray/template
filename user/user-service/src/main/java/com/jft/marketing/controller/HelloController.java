package com.jft.marketing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class HelloController {

    @GetMapping(value = "/testHello")
    public String testHello(){
        return "testHello success";
    }
}