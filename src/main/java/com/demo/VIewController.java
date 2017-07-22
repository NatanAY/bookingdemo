package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class VIewController {

    private String appMode;

    @Autowired
    public VIewController(Environment environment){
        appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Coder");
        model.addAttribute("mode", appMode);
//        model.addAttribute("mode", "development");
//        model.addAttribute("mode", "production");

        return "index";
    }
}
