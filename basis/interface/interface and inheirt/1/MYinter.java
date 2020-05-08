package com.company.demo01;

public interface MYinter {
    public default void method(){
        System.out.println("接口的默认方法");
    }
}
