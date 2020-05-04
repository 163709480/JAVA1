package com.company;

import java.util.ArrayList;

public class Manager extends user {

    private int count;

    public Manager(String name, int money) {
        super(name, money);

    }

    public Manager(){

    }

    public ArrayList<Integer>send(int totalMoney,int count){
        ArrayList<Integer>redlist= new ArrayList<>();
        int leftmoney=getMoney();

        if(totalMoney >leftmoney){
            System.out.println("余额不足");
            return  redlist;//返回空集合
        }
        super.setMoney(leftmoney-totalMoney);

        int avg =totalMoney / count;
        int mod=totalMoney % count;//剩下的的  包在最后一个红包中
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        //最后一个红包
        int last=avg+mod;
        redlist.add(last);

        return redlist;
    }

}
