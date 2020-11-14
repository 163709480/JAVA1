package demo01.Map;

import java.util.HashMap;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.println("请输入字符串");
        String ma = src.next();

        HashMap<Character,Integer>map= new HashMap<>();//创建HashMap集合
        for(char s:ma.toCharArray()){  //toCharArray将字符串转换为字符数组
            if(map.containsKey(s)){ //获取判断 s 值是否存在

                Integer value = map.get(s);//获取value值
                value++;
                map.put(s,value);//把key 和对应的value值放回map集合

            }
            else {

                map.put(s,1);//若s值不存在，则在map集合里面添加一个 key值是s、value值为1的的数值
            }

        }
        System.out.println(map);//输出map里面值所出现的次数


    }


}
