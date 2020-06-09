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
*
*
* */
public class MYinterfacel  implements  MYinterface{
    @Override
    public void main() {
//        System.out.println("实现类覆盖了重写了方法！");
//        MYinterface some= new MYinterface();

    //使用匿名内部类
        MYinterface obj = new MYinterface() {
            @Override
            public void main() {
                System.out.println("匿名内部类实现类方法");
            }
        };
        obj.main();
    }
}
