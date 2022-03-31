package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component(value = "userPoxy")
@Aspect

public class UserPoxy {
    //前置执行方法
    @Before(value = "execution(* *..User.doSome(..))")
    public void before(){
        System.out.println("before...");
    }
    //后置执行方法
    @After(value = "execution(* org.example.aop.User.doSome())")
    public void after(){
        System.out.println("after...");
    }
    @AfterReturning(value = "execution(* org.example.aop.User.doSome())")
    public void AfterReturning(){
        System.out.println("afterReturning...");
    }
    @Around(value = "execution(* org.example.aop.User.doSome())")
    public void Around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around...前");
        pjp.proceed();
        System.out.println("Around...后");
    }
}
