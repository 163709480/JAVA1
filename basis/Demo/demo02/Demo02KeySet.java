package demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
*   Map集合的第一种遍历方式:通过键找值的方式
*   Map集合中的方法:
*           Set<K> keySet()返回此映射中包含的键Set视图
*   实现步骤:
*           1.使用Map集合中的方法keySet();把Map集合所有的key取出来，存储到一个Set集合中
*           2.遍历Set集合，获取Map集合中的每一个Key
*           3.通过Map集合中的方法get(key)，通过key找到value
* */
public class Demo02KeySet {

    public static void main(String[] args) {
        //创建MAP集合对象
        Map<String,Integer> map= new HashMap<>();
        map.put("accident",2020);
        map.put("door",2);
        map.put("globe",70);

        //  1.使用Map集合中的方法keySet();把Map集合所有的key取出来，存储到一个Set集合中
        Set<String> set= map.keySet();


//        2.遍历Set集合，获取Map集合中的每一个Key
        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key=it.next();

//            3.通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("----------------------------");

        for(String key:set){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }


//        boolean B1 = map.containsKey("door");
//        System.out.println("b1"+B1);
//
//        boolean B2 = map.containsKey("dom");
//        System.out.println("b2"+B2);

            /*
            *
            * Map.Entry<K,V>在Mao接口中有一个内部接口Entry
            * 作用：当Map集合一创建，南无就会在Map集合中创建一个Entry对象，用来记录键与值(键值对对象，键与值的映射关系)
            *
            *
            * */



    }
}
