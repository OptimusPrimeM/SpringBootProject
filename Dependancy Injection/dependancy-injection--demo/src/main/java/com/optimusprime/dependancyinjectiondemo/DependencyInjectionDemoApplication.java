package com.optimusprime.dependancyinjectiondemo;

import com.optimusprime.dependancyinjectiondemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(DependencyInjectionDemoApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");

        myController.hello();
	}
}
