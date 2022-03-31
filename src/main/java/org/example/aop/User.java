package org.example.aop;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    public void doSome(){
        System.out.println("do some...");
    }
}
