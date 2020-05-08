package com.company.demo01;

import jdk.swing.interop.SwingInterOpUtils;

public class MY implements mylnA,mylnb{
    @Override
    public void mehtodA() {
        System.out.println("覆盖重写了A方法");

    }

    @Override
    public void methA() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void mehtodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methoud() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }
}
