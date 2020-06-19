package com.company.demo01;

public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    /*
    * 直接打印对象的地址值没有一丝，需要重写object的toString方法
    * 打印对象的属性（name,age）
    *
    *
    * */

//    @Override
//    public String toString() {
//
//
////        return "abc";
//        return "Person{name=}"+name+",age="+age+"}";
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
