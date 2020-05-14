package com.company.demo01;

public class ZI  extends FU{
    int num=300;
    int age=16;

    @Override
    public void shownum() {
       System.out.println(num);
    }
    public void eat(){
        System.out.println("子类类");
    }
    public void method(){
        System.out.println("子类方法");
    }
    public void methodZI(){
        System.out.println("子类特有方法");
    }
}
