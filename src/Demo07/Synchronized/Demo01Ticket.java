package Demo07.Synchronized;

/*
*       注意:线程安全问题是不能产生的,我们可以让一个
*       线程在访问共享数据的时候无论是否失去了cpu的执行权让其他的线程只能等待,
*       等待当前线程卖完票,其他线程在进行卖票
*
*
*
*
* */
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
