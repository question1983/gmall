package com.gec.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/dotest")
    public String doTest()
    {
        return "hello world";
    }
}
