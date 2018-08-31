package com.optimusprime.diwithspring.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_PRIME = "Hello_prime!";

    @Override
    public String sayGreeting() {
        return HELLO_PRIME;
    }
}
