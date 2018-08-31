package com.optimusprime.dependancyinjectiondemo.controllers;

import com.optimusprime.dependancyinjectiondemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){

        return greetingService.sayGreeting();
    }

}
