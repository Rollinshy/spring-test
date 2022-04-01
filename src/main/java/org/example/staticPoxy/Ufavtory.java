package org.example.staticPoxy;

public class Ufavtory implements Usell {
    //形参为购买数量，返回购买单价
    @Override
    public float sell(int amount) {
        float price=85;
        if(amount>=100) {
            price=price-10;
        }
        return price;
    }
}
