package com.company;

public class zi extends item {
    int num=20;
    @Override
    public void method(){
        super.method();//调用父类方法
        System.out.println("子类方法");


    }
    public void show(){
        int num=30;
        System.out.println(num);//30
        System.out.println(this.num);//20
        System.out.println(super.num);//10
    }
}
