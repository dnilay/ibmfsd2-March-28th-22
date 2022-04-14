package org.example.demo.controller;

import org.example.demo.controller.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/")
    public String home()
    {
        return "home";
    }
    @GetMapping("/showForm")
    public String showForm(Model theModel)
    {
        theModel.addAttribute("student",new Student());
        return "show-form";
    }


    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("student")Student theStudent)
    {
        return "student-confirmation";
    }
}
