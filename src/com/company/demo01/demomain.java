package com.company.demo01;

public class demomain {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Computer com= new Computer();
        com.poweron();

        //准备一个鼠标
//        Mouse mouse =new Mouse();
        //首先进行向上转型
        USB usb =new Mouse();//多态写法
        //参数是usb类型
        com.useDevice(usb);

        //创建一个USB键盘
        Keyboard key =new Keyboard();

        //方法参数是USB类型，传递进去的是实现类方法
        com.useDevice(key); //正确写法！也发生了向上转型
        //使用子类对象，匿名对象，也可以
       // com.useDevice(new Keyboard());//也是正确写法


        com.poweroff();

        System.out.println("============");

        method(10.0); //double-->double
        method(10);// int-->double
    }
        public static void method(double num){
            System.out.println(num);
        }
}
