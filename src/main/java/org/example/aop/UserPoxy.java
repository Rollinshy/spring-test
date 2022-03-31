package org.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component(value = "userPoxy")
@Aspect

public class UserPoxy {
    @Before(value = "execution(* *..User.doSome(..))")
    public void before(){
        System.out.println("before...");
    }
}
