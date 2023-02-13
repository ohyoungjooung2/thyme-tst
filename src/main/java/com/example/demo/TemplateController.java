package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//https://www.geeksforgeeks.org/spring-boot-how-thymeleaf-works/

@Controller
@RequestMapping("/")
public class TemplateController {
    @GetMapping("/template1")
    public String template(Model model){
        String msg = "Welcome to thymeleaf template";
        //Adding the attribute(key-value pair)
        model.addAttribute("message",msg);
        //returning the view name
        return "index";
    }
    
}
