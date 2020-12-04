package Demo07.Synchronized;
/*
*
*       买票案例出现了线程安全问题
*       卖出了不存在的票和重复的票
*
*       解决线程安全问题的一种方案:使用同步代码块
*       格式:
*           synchronized(锁对象){
*               可能会出现线程安全问题的代码(访问了共享数据的代码)
*           }
*       注意:
*           1.通过代码块中的锁对象,可以使用任意的对象
*           2.但是必须保证多个线程使用的锁对象是同一个
*           3.锁对象的作用:
*               把同步代码块锁住,只让一个线程在同步代码快中执行
*
*       同步技术原理:
*               使用了一个锁对象,这个锁对象叫同步锁,也叫对象锁,也叫对象监视器
*               t0抢到了cpu的执行权遇到synchronized会检查代码块是否有锁对象
*               如果有,就会获取锁对象进入同步中执行
*
*              t1抢到了cpu的执行权遇到synchronized会检查代码块是否由锁对象
*              如果没有,t1会进入到阻塞状态,会一直等待t0线程归还锁对象,一直
*              到t0线程执行完同步中的代码,会把锁对象归还给同步代码块,t1才能获取
*               到锁对象进入到同步中执行
*
*               总结:同步中的线程;没有执行完毕不会释放锁,同步外的线程没有锁进不去同步
*
*
 */

public class RunnableIml implements Runnable {

    //定义一个多线程共享的票源
    private int ticket=100;
    //创建一个锁对象
    Object obj= new Object();


    //设置线程任务:买票
    @Override
    public void run() {
       //使用死循环//让卖票操作重复执行
        while (true) {
            //先判断票是否存在
           //创建同步代码块
            synchronized (this){
                if (ticket > 0) {
                    //提高安全问题出现的概率,让程序睡眠
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //票存在 ticket--1
                    System.out.println(Thread.currentThread().getName() + "---->" + "正在卖第"  + ticket+ "张票");
                    ticket--;
                }
            }

        }
    }
}
