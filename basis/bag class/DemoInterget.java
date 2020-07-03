package com.company.demo01;
/*
*   装箱：把基本类型的数据，包装到包装类当中(基本类型的数据->包装类)
*       构造方法：
*           Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值。
            Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
*               传递字符串，必须是基本类型的字符串，否则会抛出异常"100"正确 "a"抛异常
*           静态方法
*           static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
            static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。
         拆箱:再包装类中取出基本类型的数据(包装类->基本类型的数据)
         * 成员方法:
         *       int intValue() 以 int 类型返回该 Integer 的值。
         *
         *
* */
public class DemoInterget {
    public static void main(String[] args) {
        // 装箱：把基本类型的数据，包装到包装类当中(基本类型的数据->包装类)
        //构造方法
        Integer IN1 = new Integer(1);//方法上有横线，说明方法过时了
        System.out.println(IN1);//1  重写了toString方法

        Integer IN2 = new Integer("1");
        System.out.println(IN2);

        //静态方法
        Integer IN3 = Integer.valueOf(1);
        System.out.println(IN3);
//        Integer IN4 = Integer.valueOf("A"); //NumberFormatExcepetion数字格式化异常
        Integer IN4 = Integer.valueOf("1");
        System.out.println(IN4);


//        拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
        int i=IN1.intValue();
        System.out.println(i);
    }
}

