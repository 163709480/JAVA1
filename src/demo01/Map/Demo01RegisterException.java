package demo01.Map;

import java.util.Scanner;
import java.util.Set;

public class Demo01RegisterException {
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
                try {
                    throw new RegisterException("该用户已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//结束
                }
            }




        }
        //循环结束
        System.out.println("注册成功");

    }
}
