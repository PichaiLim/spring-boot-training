package com.training.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//TODO mark bean component
@Component
public class CompanyBean {

    @Value("${company.name}")
    private String name = "FaceBook";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
