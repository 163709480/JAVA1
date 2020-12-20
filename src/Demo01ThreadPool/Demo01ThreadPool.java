package Demo01ThreadPool;
/*
*
*   线程池:jdk1.5之后提供的
*   java.tuil.concurrent.Excetors:线程池的工厂类,用来生成线程池
*   Executors类中的静态方法:
*           static ExecutorService newFixedThreadPool(int nThreads)创建一个可重复固定线程数的线程池
*           参数:
*               int nThreads:创建线程池中包含的线程数量
*           返回值ExecutorService接口,返回的是ExecutorService接口的实现类对象,我们可以使用ExecutorService接口接受(面向接口编程)
*   java.util.concurrent.ExecutorService：线程池接口
*       用来从线程池中获取线程,调用start方法,执行线程任务
*           submit(Runnable task)提交一个 Runnable任务用于执行
*       关闭/销毁线程池的方法
*           void shutdown()
*   线程池的使用步骤
*       1.使用线程池的工厂类Exectors里面提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
*       2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
*       3.调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,执行run方法
*       4.调用ExecutorService中的方法shutdown销毁线程池(不建议执行)
*
* */

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo01ThreadPool {
    public static void main(String[] args) {


        // 1.使用线程池的工厂类Exectors里面提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
//        ExecutorService es= Executors.newFixedThreadPool(2);
        ExecutorService es = Executors.newFixedThreadPool(3);

        //       3.调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,执行run方法
        es.submit(new RunnableImpi());//pool-1-thread-1创建了一个新的线程执行
        //线程池会一直开启,使用完了线程,会自动把线程归还给线程池,线程可以继续使用
        es.submit(new RunnableImpi());//pool-1-thread-1创建了一个新的线程执行
        es.submit(new RunnableImpi());//pool-1-thread-1创建了一个新的线程执行


        es.shutdown();
        es.submit(new RunnableImpi());//抛异常,线程池都没有了,就不能获取线程池了


    }
}
