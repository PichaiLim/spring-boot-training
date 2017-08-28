package com.training.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HrApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        System.out.println("First Name: " + employeeBean.getFirstName());


        String companyName = employeeBean.getCompanyBean().getName();
        System.out.println("Comapny Name: " + companyName);

        String addressEmploy = employeeBean.getAddressBean().getStreet();
        System.out.println("Address: " + addressEmploy);
    }

}
