package com.company;

import java.util.ArrayList;

public class Manager extends user {
    public Manager(String user,int morny){
        super(user,morny);


    }
    public ArrayList<Integer>send(int totn,int count){
        ArrayList<Integer>redlist=new ArrayList<>();
        if(totn > super.getMoney()){
            System.out.println("没有钱了");
            return redlist;

        }
        int num=(super.getMoney()-totn);
        setMoney(num);
        int avg=totn / count;
        int ag= totn% count;

        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);

        }
        redlist.add(ag+avg);
        return redlist;


    }



}
