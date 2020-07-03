package com.company.demo01;
/*
*
* StringBuilder的常用方法
*       public StringBuilder append(...);添加任意类型数据的字符串形式，并返回当前对象自身
*
* */

public class DEMOSTR02 {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this,调用方法的对象bu，this==bu
        StringBuilder bu2 = bu.append("a1bc");//把bu的地址赋值给了bu2
//        System.out.println(bu);//abc
//        System.out.println(bu2);//abc
//        System.out.println(bu==bu2);//比较的是地址 true


        //使用append方法无需接受返回值
        bu.append("abc");
        bu.append(1);
        bu.append(9.3);
        bu.append("中");
        bu.append(true);
        System.out.println(bu);

        /*
        *
        * 链式编程:方法返回值是一个对象，可以继续调用方法
        *
        * */
        bu.append("abc").append(1).append(true).append(8.8);
        System.out.println(bu);

    }
}
