package com.optimusprime.dependancyinjectiondemo;

import com.optimusprime.dependancyinjectiondemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");

        myController.hello();

  /*
             <----------- Spring boot java reflection------------->

        String methodName = "hello"; // the method to be called

        Object bean = applicationContext.getBean("myController");//defined by the @Component params
        try {
            Method method = bean.getClass().getMethod(methodName);
            if (method != null) {
                method.invoke(bean);//java reflection here.z
            }
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

*/
    }
}
