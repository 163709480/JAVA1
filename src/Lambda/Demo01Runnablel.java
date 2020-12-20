package Lambda;

/*
* 使用实现Runnable接口的方式实现多线程程序
*
*
* */

import DemoTread.Runnable;



public class Demo01Runnablel {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run= new RunnableImpl();
        System.out.println("111");

        Thread t = new Thread(run);
        //调用sart方法开始新线程
        t.start();

        //简化代码使用匿名内部类，实现多线程程序
        Runnable r=new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"new multithreading");
            }
        };
        new Thread(r).start();
        //简化

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"new multithreading");
            }
        }).start();//匿名内部类  简化程序 


    }
}
