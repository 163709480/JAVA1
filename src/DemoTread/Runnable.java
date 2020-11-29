package DemoTread;
//1.创建一个Runable接口的实现类



public class Runnable implements java.lang.Runnable {
        //2.再实现类中重写Runable接口的run方法,设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);


        }

    }
}
