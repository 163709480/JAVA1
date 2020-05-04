package com.company;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        member one =new member("成员",0);
        member two =new member("成员B",0);
        member three =new member("成员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=======================");
        ArrayList<Integer>redlist=manager.send(20,3);

        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);

        manager.show();//100-20
        //6 6 8 随机分给3个人
        one.show();
        two.show();
        three.show();

    }
}
