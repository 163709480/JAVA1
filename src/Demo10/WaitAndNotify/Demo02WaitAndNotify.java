package Demo10.WaitAndNotify;
/*
*
*   进入到TimeWaiting(计时等待)有两种方式
*   1.使用sleep(long m)方法,在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
*   2.使用wait(long m)方法,wait方法如果在毫秒值结束之后，还没有被notify唤醒,就会自动醒来,线程睡醒进入到可运行状态，线程睡醒进入到Runnable/Blocked状态
*
*   唤醒的方法:
*           void notify()唤醒在此对象监视器上等待的单个线程
*           void notifAll()  唤醒在此对象监视器上等待的所有线程
*
*
* */

public class Demo02WaitAndNotify {
    public static void main(String[] args) {

        //创建锁对象,保证唯一
        Object obj= new Object();
        //创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {

                while (true){
                    //保证等待和唤醒的线程只能由一个执行,需要使用同步技术
                    synchronized (obj){
                        System.out.println("告知");
                        //调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("1111包子已经做好come on");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
                    }
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {

                while (true){
                    //保证等待和唤醒的线程只能由一个执行,需要使用同步技术
                    synchronized (obj){
                        System.out.println("告知");
                        //调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("2222包子已经做好come on");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
                    }
                }
            }
        }.start();



        new Thread() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);//花5秒钟
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //保证等待和唤醒的线程只能由一个执行,需要使用同步技术
                    synchronized (obj) {
                        System.out.println("老板5秒钟之后做好包子，告知顾客,可以吃包子了");
                        //做好包子之后,调用notify方法,唤醒顾客吃包子
//                        obj.notify();//如果有多个等待线程，随机唤醒一个
                        obj.notifyAll();//唤醒所有等待的线程
                    }


                }

            }


        }.start();
    }

}
