package Demo05.Tread;
/*
*   线程的名称
*         主线程:main
*
*
* */
public class Demo01GetThreadName {
    public static void main(String[] args) {
//        //创建Thread类的子类对象
//        MyThread1 MT= new MyThread1();
//        //调用start,开启新线程执行run方法
//
//        MT.start();
//        new MyThread1().start();
//        new MyThread1().start();
//        System.out.println(Thread.currentThread().getName());

        //线程sleep


        //模拟秒表
        for (int i = 0; i < 60; i++) {
            System.out.println(i);

            //使用Threadl类的sleep方法让程序睡眠一秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
