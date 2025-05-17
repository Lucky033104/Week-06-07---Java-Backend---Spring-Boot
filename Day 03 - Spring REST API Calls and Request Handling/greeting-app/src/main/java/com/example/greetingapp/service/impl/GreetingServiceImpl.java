package com.example.greetingapp.service.impl;

import com.example.greetingapp.dto.UserDTO;
import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.repository.GreetingRepository;
import com.example.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements IGreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public String getGreetingMessage(UserDTO user) {
        if (user.getFirstName() != null && user.getLastName() != null)
            return "Hello " + user.getFirstName() + " " + user.getLastName();
        if (user.getFirstName() != null)
            return "Hello " + user.getFirstName();
        if (user.getLastName() != null)
            return "Hello " + user.getLastName();
        return "Hello World";
    }

    @Override
    public Greeting saveGreeting(UserDTO user) {
        String message = getGreetingMessage(user);
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    @Override
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }

    @Override
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    @Override
    public Greeting updateGreeting(Long id, String message) {
        Greeting greeting = greetingRepository.findById(id).orElse(null);
        if (greeting != null) {
            greeting.setMessage(message);
            return greetingRepository.save(greeting);
        }
        return null;
    }

    @Override
    public void deleteGreeting(Long id) {
        greetingRepository.deleteById(id);
    }
}
