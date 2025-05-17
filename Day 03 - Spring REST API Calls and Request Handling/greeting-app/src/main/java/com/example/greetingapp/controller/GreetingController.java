package com.example.greetingapp.controller;

import com.example.greetingapp.dto.UserDTO;
import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    @GetMapping
    public String getDefaultGreeting() {
        return "Hello World";
    }

    @GetMapping("/query")
    public String greetingWithQueryParam(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("/param/{name}")
    public String greetingWithPathParam(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/post")
    public String greetingWithPost(@RequestBody UserDTO user) {
        return greetingService.getGreetingMessage(user);
    }

    @PutMapping("/put/{firstName}")
    public String greetingWithPut(@PathVariable String firstName,@RequestParam String lastName) {
        UserDTO user = new UserDTO(firstName, lastName);
        return greetingService.getGreetingMessage(user);
    }

    @PostMapping("/save")
    public Greeting saveGreeting(@RequestBody UserDTO user) {
        return greetingService.saveGreeting(user);
    }

    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @PutMapping("/update/{id}")
    public Greeting updateGreeting(@PathVariable Long id,
                                   @RequestParam String message) {
        return greetingService.updateGreeting(id, message);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGreeting(@PathVariable Long id) {
        greetingService.deleteGreeting(id);
    }
}
