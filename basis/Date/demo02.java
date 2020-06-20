package com.company.demo01;

import java.util.Date;

public class demo02 {
    public static void main(String[] args) {
        demo03();
    }
    /*
    * long geTime()把日期转换为毫秒值(相当于System.currentTimeMillis方法)
    *       返回自 1970 年 1月1日 00:00:00 GMT以来此Date对象表示的毫秒数
    *
    *
    * */
    private static void demo03() {
        Date data = new Date();
        long time= data.getTime();
        System.out.println(time);//1592558001874



    }
    /*
   *  Data类的带参数构造方法
   *  Data(long data):传递毫秒值，把毫秒值转换为Date日期
   *
   * */

    private  static void demo02(){
        Date date= new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970
         date= new Date(1592556923813L);
        System.out.println(date);

    }

    /*
    * Data类的空参数构造方法
    * Data()获取当前系统的日期和时间
    *
    * */

    private  static void demo01(){
        Date data= new Date();
        System.out.println(data);//Fri Jun 19 17:04:50 CST 2020


    }
}
