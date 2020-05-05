package com.company;

import java.util.ArrayList;

public class main {
    public main(int money) {
    }

    public static void main(String[] args) {
        Manager manager=new Manager("用户A",100);

        member me=new member("用户B",0);
        member one=new member("用户C",0);
        member two=new member("用户D",0);
        manager.sea();
        me.sea();
        ArrayList<Integer>read=manager.send(120,3);
        me.receive(read);
        one.receive(read);
        two.receive(read);
        System.out.println("=============");
        manager.sea();
        me.sea();
        one.sea();
        two.sea();

    }
}
