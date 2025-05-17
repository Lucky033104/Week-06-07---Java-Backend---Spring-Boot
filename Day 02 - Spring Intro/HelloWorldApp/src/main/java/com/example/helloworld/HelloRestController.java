package com.example.helloworld;

import com.example.helloworld.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String helloDefault() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    
    @GetMapping("/hello/param/{name}")
    public String helloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/hello/post")
    public String helloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/hello/put/{firstName}")
    public String helloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
