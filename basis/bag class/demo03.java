package com.company.demo01;
    /*
    * StringBuilder和String可以相互转换:
        String->StringBuilder:可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder->String:可以使用StringBuilder中的toString方法
    *  public String toString()：将当前StringBuilder对象转换为String对象。
    *
    * */
public class demo03 {
        public static void main(String[] args) {
//            String->StringBuilder:
            String str="hello";
            System.out.println("str"+str);
            StringBuilder BU = new StringBuilder(str);
//            往StringBuilder中添加数据
                BU.append("world");
            System.out.println(BU);

//            StringBuilder->String:
            String S = BU.toString();
            System.out.println("S:"+S);
        }

}
