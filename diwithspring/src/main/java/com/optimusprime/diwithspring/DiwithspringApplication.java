package com.optimusprime.diwithspring;

import com.optimusprime.diwithspring.controllers.MyController;
import com.optimusprime.diwithspring.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiwithspringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =  SpringApplication.run(DiwithspringApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		myController.hello();

		System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());

	}
}
