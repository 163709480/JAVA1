package Demolearning;

import DemoTread.MyThread;

public class MYThread {
    public static void main(String[] args) {
        able my = new able();
        Thread th=new Thread(my);
        th.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}
