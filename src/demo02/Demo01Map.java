package demo02;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/*
*
*   java.util.Map<k,v>集合
*   Map集合的特点:
*       1.Map集合是一个双列集合，一个元素包含两个值(一个key，一个value)
*       2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
*       3.Map集合中的元素,key是不允许重复的，value是可以重复的
*       4.Map集合中的元素,key和value是一一对应的
*   java.utill.HashMap<k,v>集合 implements Map<k,v>接口
*   HashMap集合的特点:
*       1.HashMap集合底层是哈希表:查询的速度特别快
*           JKD1.8之前:数组+单向链表
*           jdk1.8之后:数组+单向链表/红黑树(链表的长度超过8):提高查询的速度
*       2.hashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
*   java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
*   LinkedHashMap的特点：
*           1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
*           2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
*
* */
public class Demo01Map {
    public static void main(String[] args) {

        show01();


    }
    /*
    *   public V put (K key, V value);把指定的键与指定的值添加到Map集合中
    *       返回值:v
    *               存储键值对的时候,key不重复,返回值V是null;
    *               存储键值对的时候,key重复，会使用新得value替换map中重复的value，返回被替换的value值
    *
    *
    *
    * */


    private static void show01() {
        //创建Map集合对象，多态
        Map<String,String>map= new HashMap<>();
        String v1 = map.put("李晨", "hello12");
        System.out.println("v1"+v1);
        String v2 = map.put("李晨", "hello2");
        System.out.println("v2"+v2);//v1:null
        System.out.println(map);

        String v3 = map.put("11", "dd");
        String v4 = map.put("MAP", "lost");
        System.out.println(map);


    }
}
