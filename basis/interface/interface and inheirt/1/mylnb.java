package com.company.demo01;



public interface mylnb {

//    static    错误写法！接口不能有静态代码块

//    public mylnA(){        错误写法！接口不能有构造方法
//
//    }

        public abstract void mehtodB();

        public abstract void methA();
        public default void methoud(){
                System.out.println("bbbbb");
        }
}
