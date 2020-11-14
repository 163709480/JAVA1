package demo01.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/*
*   java.util.LinkedHashMap<K,V> entends HashMap<K,V>
*   Mao接口的哈希表和链表列表实现，具有可预知的迭代顺序。
*   底层原理:
*       哈希表+链表(记录元素的顺序)
*
* */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("d","d");
        System.out.println(map);//key不允许重复，无序

        System.out.println("=====================");
        LinkedHashMap<String,String> map1= new LinkedHashMap<>();
        map1.put("a","a");
        map1.put("c","c");
        map1.put("b","b");
        map1.put("d","d");
        System.out.println(map1);//key不允许重复，有序  {a=a, c=c, b=b, d=d}




    }
}
