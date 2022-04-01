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

    //一般ioc使用xml配置文件管理
    //aop使用完全注解开发
    //测试了一下，发现可以对user任意一个方法进行增强，只需添加相应的注解就ok
    @Before(value = "execution(* *..User.doSome2(..))")
    public void before2(){
        System.out.println("before2...");
    }
    //后置执行方法
    @After(value = "execution(* org.example.aop.User.doSome2())")
    public void afte2r(){
        System.out.println("after2...");
    }
    @AfterReturning(value = "execution(* org.example.aop.User.doSome2())")
    public void AfterReturning2(){
        System.out.println("afterReturning2...");
    }
    @Around(value = "execution(* org.example.aop.User.doSome2())")
    public void Around2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around2...前");
        pjp.proceed();
        System.out.println("Around2...后");
    }
}
