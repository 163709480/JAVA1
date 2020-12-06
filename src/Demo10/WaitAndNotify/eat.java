package Demo10.WaitAndNotify;
/*
*
*   消费者(吃货)类是一个线程类,可以继承Thread
*   设置线程任务(run):吃包子
*   对包子的状态进行判断
*   false:没有包子
*       吃货调用wait方法进入等待状态
*   true:有包子
*       吃货吃包子
*       吃货吃完包子
*       修改包子的状态为false没有
*       吃货唤醒包子铺线程,生产包子
*
*
*
*
* */
public class eat extends  Thread{
    private Baozi bz;
    //2.使用带参数构造方法,为这个包子变量赋值
    public eat(Baozi bz) {
        this.bz = bz;
    }

    //设置线程(run)吃包子
    @Override
    public void run() {
        //使用死循环
        while (true){
            //必须同时同步技术保证两个线程只能有一个在执行
            synchronized (bz){
                //对包子的状态进行判断
                if(bz.falg==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            //被唤醒之后执行的代码,吃包子
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"的包子");
                bz.falg=false;
                bz.notify();
                System.out.println("吃货已经把"+bz.pi+bz.xian+"的包子吃完了,开始生产包子了");

            }

        }

    }
}
