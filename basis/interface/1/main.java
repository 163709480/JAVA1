package com.company;

import java.util.ArrayList;


/*
* 接口有就是多个类的公共规范
* 接口是一种引用数据类型，最重要的内容就是其中的，抽象方法。
* 如何定义一个接口的格式:
* public interface 接口名称{
*       //接口内容
* }
*
* 备注：换成了关键字interface之后，编译生成的字节码文件仍然是.java--> .class。
* 如果是java 7,那么接口中可以包含的内容有：
* total.常量
* 2.抽象方法
*
* 如果是java8还可以额外包含有
* 3.默认方法
* 4.静态方法
*
* 如果是java9 还可以额外包含有；
* 5.私有化方法
*
*
* 接口使用步骤
* total.接口不能直接使用，必须有一个“实现类”来“实现”该接口。
* 格式
*   public class 实现类名称 implement 接口名称{
*   //....
* }
* 2.接口的实现类必须覆盖重写(实现)接口中所有的抽象方法。
* 实现：去掉abstract关键字，加上方法体大括号
* 3.创建实现类的对象，进行使用。
*
* 注意事项：
* 如果实现类并没有覆盖重写接口中所有的抽象方法，那么找个实现类自己就必须是抽象类
*
* */
public class main {


    public static void main(String[] args) {
        //错误写法！不能直接new接口对象使用
//        name na=new name();





        //创建实现类的对象使用
        mylinterfacempl inter=new mylinterfacempl();
        inter.method();

/*
    total.接口的默认方法，可以通过接口实现类对象，直接调用。
    2.接口的默认方法，也可以被接口实现类进行覆盖重写。


/
 */

       mydefaultA a=new mydefaultA();
       a.method();//调用抽象方法，实际运行的右侧的实现类、
//        调用默认方法，如果实现类中没有，会向上找接口
        a.mehode();//这是新添加的默认方法
        System.out.println("====================");
        mydefaultB b=new mydefaultB();
        b.method();//实现了抽象方法<bbbb
        b.mehode();//实现类B覆盖重写了接口的默认方法








    }
}
