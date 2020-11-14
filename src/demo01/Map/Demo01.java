package demo01.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {

    /*
     *HashMap存储自定义类型键值
     * Map集合保证key是唯一的
     *   作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
     *
     *
     *
     * */

    public static void main(String[] args) {
//        show01();
       show02();
    }
    /*
    *
    * HashMap存储自定义类型键值
    * key:Person类型
    *     Person类就必须重写hashCode方法和equals方法 以保证key唯一
    * value:String类型
    *       可以重复
    *
    * */

    private static void show02() {
//        //创建HashMap集合
//        HashMap<Person,String>map= new HashMap<>();
//        //往集合中添加元素
//        map.put(new Person("liwang",19),"ENGLISH");
//        map.put(new Person("QIN",19),"QIN  GUO");
//        map.put(new Person("PU",49),"ERUSH");
//        map.put(new Person("liwang",19),"english");
//        //使用entrySet和增强for来遍历Map集合
//
//
//        Set<Map.Entry<Person, String>> set = map.entrySet();
//
//        for (Map.Entry<Person, String> entry : set) {
//            Person key = entry.getKey();
//            String value = entry.getValue();
//
//            System.out.println(key+"=="+value);
//        }



        //创建HashMap集合
        HashMap<String,Person>mipp=new HashMap<>();
        mipp.put("123",new Person("nihao",32));
        mipp.put("456",new Person("idea",32));
        mipp.put("000",new Person("computer",32));
        mipp.put("999",new Person("honesity",32));
        Set<Map.Entry<String, Person>> ent = mipp.entrySet();

        for (Map.Entry<String, Person> enty : ent) {
            String keyi = enty.getKey();
            Person va = enty.getValue();
            System.out.println(keyi+"===="+va);


        }


    }
    /*
    * HashMap存储自定义类型键值
    * key:String类型
    *     String类重写hashCode方法和equals方法，可以保证key唯一
    * value:Person类型
    *       value可以重复(同名同年龄人视为同一个)
    *
    * */


    private static void show01() {
    //创建HashMap集合
//        HashMap<String,Person>map=new HashMap<>();
//        //往集合中添加元素
//        map.put("北京",new Person("ZHANG",18));
//        map.put("shang",new Person("ZHong",8));
//        map.put("cheng",new Person("san",24));
//        map.put("北京",new Person("Dong",39));
//        //使用keySet增强for遍历Map
//        Set<String> set = map.keySet();
//        for (String key : set) {
//            Person value = map.get(key); 通过获取key来找到对应的value值
//            System.out.println(key+"--"+value);
//
//        }

        HashMap<Person,Integer> pit= new HashMap<>();
        pit.put(new Person("bei",12),32);
        pit.put(new Person("hen",54),98);
        pit.put(new Person("shun",42),54);
        pit.put(new Person("bei",12),434);
        //使用keyset增强for遍历Map
        Set<Person> set1 = pit.keySet();
        for (Person person : set1) {
            Integer str= pit.get(person);//通过Person(key)来找到对应的value

            System.out.println(person+"==="+str);


        }


    }


}
