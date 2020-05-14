package com.company.demo01;

public class ZI extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //子类特有方法
    public void catchmouse(){
        System.out.println("猫抓老鼠");
    }
}
