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

//        show01();

//        show02();
//        show02();

//        show03();
        show04();
    }


    /*
    *
    *
    * bollean containsKey(Object key)判断集合中是否包含指定的键
    * 包含返回true，不包含返回false
    *
    *
    * */
    private static void show04() {
        //创建MAP集合对象
        Map<String,Integer> map= new HashMap<>();
        map.put("accident",2020);
        map.put("door",2);
        map.put("globe",70);

        boolean B1 = map.containsKey("door");
        System.out.println("b1"+B1);

        boolean B2 = map.containsKey("dom");
        System.out.println("b2"+B2);





    }

    /*
    *   public V get (Object key)根据指定的键，在Map集合中获取对应的值
    *       返回值:
    *               key存在，返回对应的value值
    *               key不存在，返回null
    *
    * */

    private static void show03() {

        //创建MAP集合对象
        Map<String,Integer> map= new HashMap<>();
        map.put("accident",2020);
        map.put("door",2);
        map.put("globe",70);


        Integer V1 = map.get("door");
        System.out.println(V1);//2

        Integer V2 = map.get("111");
        System.out.println(V2);//NULL


    }

    private static void show02() {

        /*
        * public V remove(Object key): 把指定的键 所对应的键值对元素  在Map集合中删除,返回被删除的值
        *   返回值:V
        *           key存在，v返回被删除的值
        *           key不存在，v返回NULL
        *
        *
        * */
        //创建MAP集合对象
        Map<String,Integer> map= new HashMap<>();
        map.put("accident",2020);
        map.put("door",2);
        map.put("globe",70);
        System.out.println(map);

        Integer V1 = map.remove("accident");
        System.out.println("V1:"+V1);//V1:2020

        System.out.println(map);//{door=2, globe=70}

       int V2 = map.remove("22");//自动拆箱 NullPointerException

        //Integer V2 = map.remove("li");

        System.out.println(V2);//NULL  没有对应的值


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
        String v1 = map.put("LICHEN", "hello12");
        System.out.println("v1"+v1);
        String v2 = map.put("LICHEN", "hello2");
        System.out.println("v2"+v2);//v1:null
        System.out.println(map);

        String v3 = map.put("11", "dd");
        String v4 = map.put("MAP", "lost");
        System.out.println(map);


    }
}
