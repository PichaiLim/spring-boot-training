package com.training.javaconfig;

import com.training.javaconfig.bean.Animal;
import com.training.javaconfig.bean.Human;
import com.training.javaconfig.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApp {

    public static void main(String[] args) {

        //TODO load spring container using AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //TODO get bean Human from spring context
        Human human = context.getBean(Human.class);
        System.out.println("Human: " + human.getName());

        //TODO get bean Animal from spring context
        Animal animal = context.getBean(Animal.class);
        System.out.println("animal name: " + animal.getName());

        //TODO get 2 Human bean and compare
        Human human2 = context.getBean(Human.class);
        System.out.println("human == human2: " + (human == human2));


        //TODO get 2 Animal bean and compare
        Animal animal2 = context.getBean(Animal.class);
        System.out.println("animal == animal2: " + (animal == animal2));

    }
}
