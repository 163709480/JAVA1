package com.company.demo01;

/*
* 向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端；
* 对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
*
* 解决方案：用对象的向下转型【还原】
* */

public class  main2 {
    public static void main(String[] args) {
    //对象的向上转型，就是：父类引用指向子类对象

    Animal  animal=new ZI();
    animal.eat();
//    animal.catmouse  错误写法！
        //向下转型，进行"还原"动作；
        ZI zi=(ZI)animal;
        zi.catchmouse();
        //下面是错误的向下转型

        dog dg= (dog) animal;  //错误写法！编译不会报错，但是运行会出现异常；
//        java.lang.ClassCastException 类转换异常
    }
}
