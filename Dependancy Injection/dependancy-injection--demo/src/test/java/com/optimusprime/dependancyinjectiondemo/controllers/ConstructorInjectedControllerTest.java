package com.optimusprime.dependancyinjectiondemo.controllers;

import com.optimusprime.dependancyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayHello() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_PRIME, constructorInjectedController.sayHello());

    }

}