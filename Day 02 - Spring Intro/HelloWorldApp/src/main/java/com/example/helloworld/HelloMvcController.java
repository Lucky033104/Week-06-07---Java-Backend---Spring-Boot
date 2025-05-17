package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloMvcController {

    @GetMapping("/web")
    public String helloPage(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz using Thymeleaf!");
        return "hello";
    }
}



