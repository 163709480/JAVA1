package com.company;

/*
* 问题描述：
* 我们需要抽取一个共有方法，来解决两个默认方法之间重复代码的问题。
* 但是这个共有方法不应该让实现类来使用，应该是私有化的。
*
* 解决方法
* 从java9开始，接口当中允许定义私有方法；
* total.普通私有方法，解决多个默认方法之间代码重复问题
* 格式
* private 返回值类型 方法名称(参数列表)
*   方法体
* }
* 2.静态私有方法，解决多个静态方法之间重复代码问题
* 格式
* private static 返回值类型 方法名称(参数列表){
*   方法体
* }
* */

public interface privatB {
    public static void mehod1(){

        System.out.println("静态方法1");
        mthodcommon();
    }
    public static void mehod2(){
        System.out.println("静态方法2");
        mthodcommon();

    }
    private static void mthodcommon(){
        System.out.println("AAAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
