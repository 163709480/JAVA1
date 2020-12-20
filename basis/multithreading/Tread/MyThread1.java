package Demo05.Tread;
/*
*   获取线程的名称
*       1.使用Tread类中的方法getName()
*           String getName()返回该线程的名称。
*       2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
*           static Thread currenThread()返回当前正在执行的线程对象的引用.
*
*
* */
//定义一个Thread类的子类

public class MyThread1 extends Thread {
    @Override
    public void run() {
        //获取线程的名称
//        String name = getName();
//        System.out.println(name);
//        Thread t = Thread.currentThread();
//        System.out.println(t);//Thread[Thread-0,5,main]
//        String name = t.getName();
//        System.out.println(name);
        //链式编程
        System.out.println(Thread.currentThread().getName());


    }
}
