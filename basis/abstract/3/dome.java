package com.company;

import java.util.ArrayList;

public class dome  {
/*
* total.抽象类不能创建对象 如果创建  编译无法通过而报错。只能创建其非抽象子类对象。
*
* 2.抽象类中，可以有构造方法，是供子类创建对象时，初始化父类使用的。
*
* 3.抽象类中不一定包含抽象方法 但是有抽象方法的类必定是抽象类。
*
* 4.抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象类
* */



    public static void main(String[] args){

     //animal an=new animal() //错误

        dog2h dg= new dog2h();//这是普通类，可以直接new对象
        dg.eat();
        dg.sleep();
        System.out.println("++++++++++++++++++++++++++");

        golden ge= new golden();
        ge.sleep();
        ge.eat();








    }






}
