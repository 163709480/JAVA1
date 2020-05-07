package com.company;

/*
* super关键字的用法有3钟；
* 1.在子类的成员方法钟，访问父类的成员变量。
* 2.在子类的成员方法钟，访问父类的成员方法
* 3.在子类的构造方法中，访问父类的构造方法
* */
public class CD extends item{

    int num=10;

//    public CD(){
//        super(10,20);
//        System.out.println(number);
//        System.out.println(count);
//    }

    public void methodzi(){
        System.out.println(super.num);
    }
    public void method(){
       // super.method();//访问父类中的method
        System.out.println("子类方法");
    }

}

