package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by spdier on 2018-12-18.
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "hello,world";
    }

}
