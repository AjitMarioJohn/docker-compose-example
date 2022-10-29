package com.demo.servicethree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.demo")
public class ServiceThreeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceThreeApplication.class, args);
    }
}
