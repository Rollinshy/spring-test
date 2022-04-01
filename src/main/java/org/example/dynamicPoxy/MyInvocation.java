package org.example.dynamicPoxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocation implements InvocationHandler {
    private Object target=null;
    public MyInvocation(Object target){
        this.target=target;
    }
    //对目标类的方法加强的代码写在这里
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       Object o=method.invoke(target,args);
       float price=(float)o;
       o=price+10;
        System.out.println("这里实现了sell方法增强");
        return o;
    }
}
