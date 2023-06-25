package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/")
    public String hello()
    {
        return "Hello docker";
    }

    @RequestMapping("/first")
    public String firstEndPoint()
    {
        return "Hello first end Point ";
    }


}
