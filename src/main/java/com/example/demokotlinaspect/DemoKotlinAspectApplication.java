package com.example.demokotlinaspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoKotlinAspectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoKotlinAspectApplication.class, args);
    }

}
