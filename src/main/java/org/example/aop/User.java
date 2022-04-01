package org.example.aop;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    public void doSome(){
        System.out.println("do some...");
    }
    public  void doSome2(){
        System.out.println("do some2..."); }
}
