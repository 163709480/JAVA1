package com.company.demo01;



/*
* 如果接口的实现类(或者父类的子类)只需要使用唯一的一次，
* 那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】
*
* 匿名内部类的定义格式:
* 接口名称 对象名 = new 接口名称();{
*   //覆盖重写所有抽象方法
* }
*
* 对格式进行解析"new 接口名称() {....}"
* 1.new代表创建对象的动作
* 2.接口名称就是匿名内部类需要实现哪个接口
* 3.{.....}这才是匿名内部类的内容
*
* 另外还要注意几点问题；
* 1.匿名内部类，在【创建对象】的时候，只能使用唯一一次。
* 如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了
*
*
* */
public class MYinterfacel  implements  MYinterface{
    @Override
    public void main() {
        System.out.println("实现类覆盖了重写了方法！11111");
//        MYinterface some= new MYinterface();

//    //使用匿名内部类
//        MYinterface obj = new MYinterface() {
//            @Override
//            public void main() {
//                System.out.println("匿名内部类实现类方法2222");
//            }
//
//        @Override
//        public void method() {
//            System.out.println("匿名内部类实现类方法");
//        }
//        };
//
//        obj.main();

    }





    @Override
    public void method() {
        System.out.println("实现类覆盖重写了方法222");
    }
}
