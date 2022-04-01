package org.example;

import org.example.staticPoxy.Taobao;

public class StaticPoxyTest {
    public static void main(String[] args) {
        Taobao t=new Taobao();
        System.out.println(t.sell(1));
    }
}
