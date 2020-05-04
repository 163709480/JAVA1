package com.company;

import java.util.ArrayList;
import java.util.Random;
//普通成员

public class member  extends user{
    public member() {
    }

    public member(String name, int money) {

        super(name, money);
    }
    public void receive(ArrayList<Integer>list){
        //从多个红包当中随便抽取一个 给我自己
        //随机获取一个集合当中的索引编号
        int index=new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且得到被删除的红包 给我自己
        int detal =list.remove(index);
        //当前成员本来自己有多少钱
        int money=super.getMoney();
        //加法 并且重新设置回去
        super.setMoney(money+detal);





    }
}
