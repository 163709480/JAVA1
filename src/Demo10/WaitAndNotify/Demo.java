package Demo10.WaitAndNotify;
/*
* 测试类
*   包含main方法,程序执行的入口,启动程序
*   创建包子对象
*   创建包子辅线程,开启,生产包子;
*   创建吃货线程,开启吃包子
*
* */
public class Demo {
    public static void main(String[] args) {
        //创建包子对象
        Baozi bz= new Baozi();
        //创建包子辅线程,开启,生产包子
       new BaoZipu(bz).start();
       //创建吃货线程,开启,吃包子
        new eat(bz).start();
    }

}
