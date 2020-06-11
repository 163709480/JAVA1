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
 *2.匿名对象，在【调用方法】的时候，只能调用唯一一次
 * 如果希望同一个对象，调用多次方法，那么必须给对象起个名字
 * 3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
 *  强调，匿名内部类和匿名对象不是一回事！！
 * */
public class DDemo2MAIN {
    public static void main(String[] args) {
//使用匿名内部类,但不是匿名对象，对象名称就是objA
        MYinterface obj = new MYinterface() {
            @Override
            public void main() {
                System.out.println("匿名内部类实现类方法111");
            }

            @Override
            public void method() {
                System.out.println("匿名内部类实现类方法");
            }
        };

        obj.main();
        obj.method();

//        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
//        MYinterface obj2= new MYinterface() {
//            @Override
//            public void main() {
//                System.out.println("匿名内部类实现类方法111");
//            }
//
//            @Override
//            public void method() {
//                System.out.println("匿名内部类实现类方法222");
//            }
//        };
//        obj2.main();
//        obj2.method();

        System.out.println("=============");

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
       new MYinterface(){
           @Override
           public void main() {
               System.out.println("匿名内部类实现类方法111B");
           }

           @Override
           public void method() {
               System.out.println("匿名内部类实现类方法222BB");
           }

       }.method();
        new MYinterface(){
            @Override
            public void main() {
                System.out.println("匿名内部类实现类方法111B");
            }

            @Override
            public void method() {
                System.out.println("匿名内部类实现类方法222BB");
            }

        }.main();
       //因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象


    }
}