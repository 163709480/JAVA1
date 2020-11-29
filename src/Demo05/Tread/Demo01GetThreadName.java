package Demo05.Tread;
/*
*   线程的名称
*         主线程:main
*
*
* */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread1 MT= new MyThread1();
        //调用start,开启新线程执行run方法

        MT.start();
        new MyThread1().start();
        new MyThread1().start();
        System.out.println(Thread.currentThread().getName());
    }
}
