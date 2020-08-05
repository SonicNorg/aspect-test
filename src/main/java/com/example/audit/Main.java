package com.example.audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Main {
    @Autowired
    TestAuditable obj;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
