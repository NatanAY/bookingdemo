package com.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private int ff;

    @RequestMapping("/hello")
    public String hello(){
        return "hello wer";
    }

}





