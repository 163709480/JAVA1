package com.company.demo01;

public class Demo02 {
    public static void main(String[] args) {
        /*
        * Person类默认继承了object类，所以可以使用Object类的equalsf方法
        * boolean equals(object obj)指示其他某个对象是否与此对象“相等”
        * equals方法源码：
        *   public boolean equals(Object obj){
        *       return(this == obj);
        * }
        * 参数：
        *       object obj:可以传递任意的对象
        *       == 比较运算符，返回的是一个布尔值 true false
        *       基本数据类型：比较的是值
        *       引用数据类型：比较的是两个对象的地址值
        *     this是谁？那个对象调用的方法，方法中的this就是那个对象；p1调用的equals方法所以this就是p1
        *       obj是传递过来的参数p2
        *       this == obj -- >p1 == p2
        * */


        Person p1= new Person("你好",20);
        Person p2= new Person("你好233",30);
        System.out.println("p1"+p1);//p1com.company.demo01.Person@34a245ab
        System.out.println("p2"+p2);//p2com.company.demo01.Person@7cc355be


        p1=p2;//把p2地址值复=赋值给p1


        boolean b = p1.equals(p1);
        System.out.println(b);


    }
}
