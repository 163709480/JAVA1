package com.company.demo01;

/*
*   Calendar类是一个抽象类，里面提供了很多操作日历的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR
*   Calendar类无法直接创建对象使用、里面有个静态方法叫做getInstance()，该方法返回了Calendar类的子类对象
*   static Calendar getInstance()使用默认时区和语言环境获得的一个日历
*
* 、)
* */

import java.util.Calendar;

public class demo04 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();//多态
        System.out.println(c);



    }
}
