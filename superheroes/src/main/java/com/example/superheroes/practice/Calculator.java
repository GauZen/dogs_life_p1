package com.example.superheroes.practice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jdk.jfr.Percentage;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int addition(int num1, int num2){
        return num1+num2;
    }
    @PostConstruct
    public void init(){
        System.out.println("Calculator has been created!!!1");

    }

    @PreDestroy
    public void destroy(){
        System.out.println("calculator will be destroyed :(((");
    }
}
