package com.company.demo01;

/*
* 接口当中也可以定义“成员变量”,但必须使用public static final三个关键字进行修饰。
* 从效果上看，这其实就是接口的【常量】。
* 格式
*   public static final 数据类型 常量名称=数据值;
*   注意：
* 一旦使用final关键字进行修饰，说明不可改变
* 注意事项:
* 1.接口当中的常量，可以省略public static final,注意：不写也照样是这样
* 2.接口当中的常量，必须进行赋值；不能不赋值。
* 3.接口当中常量的名称，使用完全大写的字母，用下划线进行分隔。(推荐命名规则)
*
* */
public class myln {
    //这其实就是一个常量，一旦赋值，不可修改
    public static final int NUM_OF_MY_CLASS =10;
}
