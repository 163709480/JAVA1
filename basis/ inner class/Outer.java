package com.company.demo01;



    public class Outer {
        //如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名


            int num=10;//外部类的成员变量

            public class Inner{
                int num=20;//内部类的成员变量
                public void mehotdInner(){
                    int num=30;//内部类方法的局部变量
                    System.out.println(num);//局部变量，就近原则
                    System.out.println(this.num);//内部类的成员变量
                    System.out.println(Outer.this.num);;//外部类的成员变量
                }

            }

    }


