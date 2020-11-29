package Demo05.Tread;

public class Demo01THread {
    public static void main(String[] args) {
        //开启多线程
        MyThread2 mt=new MyThread2();
        mt.setName("xiao");
        mt.start();
        //开启多线程

        new MyThread2("wangcai").start();

    }
}
