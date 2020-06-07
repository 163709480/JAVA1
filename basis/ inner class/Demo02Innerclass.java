package com.company.demo01;

public class Demo02Innerclass {
    public static void main(String[] args) {
        //外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner obj =new Outer().new Inner();
        obj.mehotdInner();

    }
}
