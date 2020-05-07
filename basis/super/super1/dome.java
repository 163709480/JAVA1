package com.company;

import java.util.ArrayList;

public class dome {
//1.子类构造方法当中有一个默认隐含的 supe() 调用，所以一定是先调用的父类构造，后执行子类构造
 //2.可以通过super关键字来子类构造调用父类重载
 //3.super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造
 //4.子类必须调用父类构造方法，不写则赠送super(),写了则用写的指定super调用,“super只能用一个，还必须是第一个”。

    public static void main(String[] args){
  CD cd=new CD();

    }
}
