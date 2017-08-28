package com.training.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//TODO mark this bean is Configuration Bean
@Configuration

//TODO mark scan component package
@ComponentScan("com.training.javaconfig")

//TODO import resource XML Configuration
public class AppConfig {


}
