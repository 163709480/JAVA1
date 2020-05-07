package com.company;
/*
* super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三中；
*
* total.在本类的成员方法中，访问本类的成员变量；
* 2.在本类的成员方法中，访问本类的另一个成员方法；
* 3.在本类的构造方法中，访问本类的另一个构造方法；
* 在第三种用法中要注意；
*   A. this(..)调用也必须是构造方法的第一个语句，唯一个。
*   B.super和this两种构造调用不能同时使用。
*
*
*
* */

public class CD extends item{
    int num=20;

    public CD(){

        this(10);//本类的无参构造，调用父类的有参调用
//        this(2,3);//错误写法

    }
    public  CD(int a){

    }
    public  CD(int n,int c){

    }



    public void num(){
        int num=10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类中的成员变量
    }
    public void numa(){
        System.out.println("a");
    }
    public void numb(){
        this.numa();//本类当中
        System.out.println("b");

    }


}

