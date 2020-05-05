package com.company;

import java.util.ArrayList;
import java.util.Random;
//普通成员

public class member extends user {
    public member() {
    }
    public member(String user,int morny){
        super(user,morny);

    }
    public void receive(ArrayList<Integer>list){
        int dext= new Random().nextInt(list.size());
        int de=list.remove(dext);
        int money=super.getMoney();
        super.setMoney(money+de);

    }







}
