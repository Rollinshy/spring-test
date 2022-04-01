package org.example.staticPoxy;

public class Taobao implements Usell {
    private Usell u=null;
    @Override
    public float sell(int amount) {
        u=new Ufavtory();
        //淘宝商家向厂家进货100个u盘
        float price;
        price = u.sell(100);
        //卖给客户的比进厂家贵10块
        return price+10;
    }
}
