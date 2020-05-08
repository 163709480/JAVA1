package com.company.demo01;

/*
* 这个接口中有4个方法
* methodA来源于接口A
* methodB来源于接口B
* methodcommon同时来源于接口A和B
* method 来源于我自己
*
* 注意事项：
* 1.多个父接口当中的抽象方法如果重复，没关系
* 2.多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且必须带着default关键字】
*
* */
public interface MYINTCE extends MYINTA,MYINTB {


    public abstract void method();

    @Override
    default void methoddefault() {

    }
}
