package com.company.demo01;

public interface MYINTB {
    public abstract void methodB();

    public abstract void methodcommon();


    public default void methoddefault(){
        System.out.println("BBB");
    }

}
