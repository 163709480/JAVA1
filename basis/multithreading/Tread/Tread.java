package Demo05.Tread;
/*
*       主线程:执行主方法(main)的线程
*
*       单线程程序:java程序只有一个线程
*       执行从main方法开始,从上到下依次执行
*
*       JVM执行main方法,main方法会进入到栈内存
*       JVM会找操作系统开辟一条main方法通往cpu的执行路径
*       CPU就可以通过这个路径来执行main方法
*       而这个路径有一个名字叫Mian(主)线程
* */
public class Tread {
    public static void main(String[] args) {
        Person p1= new Person("xiap");
        p1.run();
        System.out.println(0/0);//.ArithmeticException: / by zero
        Person p2=new Person("wang");
        p2.run();
    }
}
