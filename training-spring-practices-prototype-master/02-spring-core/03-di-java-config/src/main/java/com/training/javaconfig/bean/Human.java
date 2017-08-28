package com.training.javaconfig.bean;

import org.springframework.stereotype.Component;

//TODO mark bean component
@Component
public class Human {

    private String name = "Company";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
