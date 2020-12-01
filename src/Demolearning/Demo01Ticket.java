package Demolearning;

public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableIml run= new RunnableIml();
        //创建Thread,  传递Runnable接口中的实现类对象
        /*
        * 开启了三个线程t0,t1,t2 3个线程一起抢夺cpu的执行权,谁抢到谁执行
        *
        *
        * */
        Thread to=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);

        to.start();
        t1.start();
        t2.start();



    }
}
