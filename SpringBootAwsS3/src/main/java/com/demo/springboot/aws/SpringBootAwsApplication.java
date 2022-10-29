package com.demo.springboot.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.demo")
public class SpringBootAwsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsApplication.class, args);
    }
}
