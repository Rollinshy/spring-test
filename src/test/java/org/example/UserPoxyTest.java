package org.example;

import org.example.aop.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserPoxyTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean1.xml");
        User user=(User)ac.getBean("user",User.class);
        user.doSome();
    }
}
