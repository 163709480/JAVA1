package DemoTread;

//import Demo05.Tread.Person;

//1.创建一个Thread类的子类
public class MyThread extends  Thread {
    //.在Thread类的子类中重写Thread中的run方法，设置线程任务

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);

        }

    }
}
