package demo01.Map;

import java.util.Scanner;
import java.util.Set;

public class Demo02RegisterException {
    static String[] username={"lisi","zhangsan","wang"};
    public static void main(String[] args)/* throws RegisterException*/ {

        Scanner in=new Scanner(System.in);
        String putcounter = in.next();


        equally(putcounter);


    }

    private static void equally(String name) /*throws RegisterException*/ {
        for(String na:username){
            if(na.equals(name)){
                //true
                throw new RegisterException("该用户名已经被注册");
            }




        }
        //循环结束
        System.out.println("注册成功");

    }
}
