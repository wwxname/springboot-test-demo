package com.example.demo1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class DemoController {


    @ResponseBody
    @RequestMapping("/getPerson")
    public Object getPerson() {
        Person p = new Person();
        p.name = "wwx";
        return p;
    }


}
