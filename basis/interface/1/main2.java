package com.company;
/*
*
* 注意：不能通过接口实现类的对象来调用接口当中的静态方法
* 正确用法：通过接口名称直接调用其中的静态方法。
* 格式:
*   接口名称.静态方法名(参数)
*
* */
public class main2 {
    public static void main(String[] args){
        //实现了类的对象
       mydefaceStaticlmpl my=new mydefaceStaticlmpl();
       //my.methst  错误写法

        //直接通过接口名称调用静态方法
        mydefaceStatic.methst();
    }


}
