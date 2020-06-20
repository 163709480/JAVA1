package com.company.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/*
    分析：
        1，使用Scanner类中的方法next,获取出生日期
        2.使用DateFormat类中的方法parse，把字符串的出生日期，解析为Date格式的出生日期
        3.把Date格式的出生日期转换为毫秒值
        4.获取当前日期转换为毫秒值
        5.使用当前日期的毫秒值-出生日期的毫秒值
        6.把毫秒值转换为天(s/1000/60/60/24)
*
*
* */
public class demo04 {
    public static void main(String[] args) throws ParseException {
        //1 使用Scanner类中的方法next,获取出生日期
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入您的出生日期,格式:yyyy-MM-dd");
        String bir=sc.next();
//        2.使用DateFormat类中的方法parse，把字符串的出生日期，解析为Date格式的出生日期

         SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
         Date date= sdf.parse(bir);
         long time=date.getTime();
         long today=new Date().getTime();
        long times= today-time;
        System.out.println(times/1000/60/60/24);



    }
}
