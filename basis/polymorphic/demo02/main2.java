package com.company.demo01;

/*
* 在多态的代码中，成员方法的访问规则是：
* 看new的是谁，就优先用谁，没有则向上找。
*
* 编译看左边，运行看右边。
*
*
* 成员变量：编译看左边，运行还看左边
* 成员方法：编译看左边，运行看右边。
* */

public class  main2 {
    public static void main(String[] args) {
        FU obj= new ZI();
        obj.method();//父子都有 ，优先用子  (new 的是ZI)
        obj.methodFU();//子类没有，父类有，向上找到父类

        //编译看左，左边是FU，FU当中没有methodzi方法，所以编译报错
//        obj.methodZI()  错误写法
    }
}
