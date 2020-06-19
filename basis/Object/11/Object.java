package com.company.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
*
*   java.lang.Object
*   类Object 是类层级结构的根类。每个类(person,student..)都使用Object作为(父)超类。
*   所有对象（包括数组）都实现这个类的方法
*
*
* */
public class Object {
    public static void main(String[] args) {
        /*
        * person类继承了object类，所以可以使用object类当中的toString方法
        * */
        Person p =new Person("长大",18);
        String s=p.toString();
        System.out.println(s);//com.company.demo01.Person@b4c966a  |abc

        //直接打印对象的名字，其实就是调用对象的toString p=p.toString();
        System.out.println(p);
        //看一个类是否重写了toString,直接打印这个类的对象即可,如果没有重写toString方法那么打印的是对象的地址值

        Random r= new Random();
        System.out.println(r);//java.util.Random@7cd84586
        Scanner sc= new Scanner(System.in);
        System.out.println(sc);//java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0]
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);






    }
}
