package org.example;

import org.example.dynamicPoxy.MyInvocation;
import org.example.staticPoxy.Ufavtory;
import org.example.staticPoxy.Usell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicPoxy {
    public static void main(String[] args) {
        //创建一个接口
        //创建这个接口的实现类，即目标类
        Usell u=new Ufavtory();
        InvocationHandler invocationHandler=new MyInvocation(u);
        //创建一个类并实现InvocationHandle接口
        //利用InvocationHandle实现类创建代理对象
        Usell usell= (Usell) Proxy.newProxyInstance(u.getClass().getClassLoader(),u.getClass().getInterfaces(),invocationHandler);
        float price=usell.sell(1);
        System.out.println(price);
        //代理对象调用方法
    }
}
