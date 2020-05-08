package com.company.demo01;

public interface MYINTA {
    public abstract void methodA();

    public abstract void methodcommon();

    public default void methoddefault(){
        System.out.println("AAAA");
    }


}
