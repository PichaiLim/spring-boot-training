package com.training.spring.di.constructor;

import com.training.spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingConstructor {

    private String text = "default constructor text";

    public GreetingConstructor() {
    }


    private HelloWorld helloWorld;

    public GreetingConstructor(String text, HelloWorld helloWorld) {
        this.text = text;
        this.helloWorld = helloWorld;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GreetingConstructor greetingConstructor = context.getBean(GreetingConstructor.class);
        System.out.println(greetingConstructor.getText());

        String message = greetingConstructor.getHelloWorld().message;
        System.out.println("args = [" + message + "]");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }
}
