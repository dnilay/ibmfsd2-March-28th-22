package com.example.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class DemoController {

    @RequestMapping
    public String sayHello(Model theModel)
    {
        theModel.addAttribute("theDate",new Date());
        return "hello-world";

    }
    @GetMapping("/showForm")
    public String showForm()
    {
        return "show-form";
    }
@PostMapping("/processForm")
    public String processForm(@RequestParam("name") String name, Model model)
    {
        model.addAttribute("NAME",name);
        return "employee-confirmation";
    }
}
