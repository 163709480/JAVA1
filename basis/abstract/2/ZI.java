package com.company;

public class ZI  extends  FU{
    public ZI(){
        //super()
        System.out.println("子类构造方法执行");
    }

// alt + 回车 直接创建覆盖重写
    @Override
    public void eat() {
        System.out.println("eat");
    }
}
