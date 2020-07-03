package com.company.demo01;
/*
* 基本类型与字符串类型之间的相互转换
* 基本类型->字符串(String)
*       1.基本类型的值+"" 最简单的方法(工作中常用)
*       2.包装类的静态方法toString(参数),不是Object类的toString（）重载
*           sataic String toString(int i)返回一个表示指定整数的String对象
*       3.String类的静态方法valueof(参数)
*           static String valueof(int i)返回 int参数的字符串表示形式
*   字符串(String)->基本类型
*       使用包装类的静态方法parseXXX("数值类型的字符串");
*           integer类:static double parseDouble(String s)
* */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型->字符串(String)
        int i1=100;
        String si=i1+"";
        System.out.println(si+200);

        String s2 = Integer.toString(100);
        System.out.println(s2+200);
        String s3 = String.valueOf(100);
        System.out.println(s3+200);

        //字符串(String)->基本类型
        int i= Integer.parseInt(si);
        System.out.println(i-10);

        int a =Integer.parseInt("a");
        System.out.println(a);



    }


}
