package demo01.Map;

/*
*
*   java.lang.Throwable:类是java语言中所有错误或异常的超类
*       Exception:编译器异常，进行编译(写代码)java程序出现的问题
*           RuntimeException:运行期异常,java程序运行过程中出现的问题
*           异常就相当于程序得了一个小毛病，把异常处理掉，程序可以继续执行
*       Error:错误
*           错误就相当于程序得了一个无法治愈得毛病必须修改源代码，程序才能继续执行
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) {
//        Exception:编译器异常，进行编译(写代码)java程序出现的问题
//        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd");//用来格式化日期
//        Date date = null;
//        try {
//            date = sdf.parse("1999-09-09");//把字符串格式得日期，解析为Date格式得日期
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);

        //RuntimeException:运行期异常,java程序运行过程中出现的问题
//        int []arr={1,3,4};
       // System.out.println(arr[0]);
//        try{
//            //可能会出现异常的代码
//            System.out.println(arr[3]);
//
//        }catch (Exception e){
//            //异常的处理逻辑
//            Sy stem.out.println(e);
//
//        }
        /*
        * Error:错误
        * OutOfMemoryError: Java heap space
        * 内存溢出的错误，创建数组太大,超出了给jvm分配的内存
        *
        * */

        int[] arr=new int[1024*1024*2014];
        //必须修改代码，创建的数组小一点




        System.out.println("后续代码");
    }
}
