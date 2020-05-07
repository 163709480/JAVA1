package com.company;

/*
* 从java8开始，接口当中允许定义静态方法
* 格式
* public static 返回值类型 方法名称（参数列表）
*
* 提示：就是将abstract或者default换成static即可，带上方法体。
* */


public interface mydefaceStatic {
    public static void methst(){
        System.out.println("这是接口静态方法");
    }
}
