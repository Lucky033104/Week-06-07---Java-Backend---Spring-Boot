package com.example.greetingapp.service;

import com.example.greetingapp.dto.UserDTO;
import com.example.greetingapp.model.Greeting;

import java.util.List;

public interface IGreetingService {
    String getGreetingMessage(UserDTO user);
    Greeting saveGreeting(UserDTO user);
    Greeting getGreetingById(Long id);
    List<Greeting> getAllGreetings();
    Greeting updateGreeting(Long id, String message);
    void deleteGreeting(Long id);
}
