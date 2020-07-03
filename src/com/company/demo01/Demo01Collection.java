package com.company.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
*   JAVA.util.Collection接口
*       所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
*       任何的单列集合都可以使用Collection接口中的方法
*共性的方法:
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
* */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
//        Collection<String>cpll= new ArrayList<>();
        Collection<String>cpll=new HashSet<>();
        System.out.println(cpll);//重写了toString方法
        /*
        * public boolean add(E e);  把给定的对象添加到当前集合中
        * 返回值是一个boolean值，一般都返回true,所以可以不用接受
        *
        * */
        boolean b1= cpll.add("张大");
        System.out.println("b1"+b1);//true
        System.out.println(cpll);//[张三]
        cpll.add("李四");
        cpll.add("李2");
        cpll.add("李1");
        cpll.add("李3");
        System.out.println(cpll);

        /*
        *  public boolean remove(E e): 把给定的对象在当前集合中删除。
        * 返回值是一个boolean值，集合中存在元素，删除元素，返回true
        *                      集合中不存在元素，删除失败，返回false
        * */
        boolean b2 = cpll.remove("李四");
        System.out.println("b2"+b2);
        boolean b3 = cpll.remove("李四3");
        System.out.println("b3"+b3);//b3:false
        System.out.println(cpll);//[张大, 李2, 李1, 李3]

        /*
        *  public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        *       包含返回true
        *       不包含返回false
        * */
        boolean b4 = cpll.contains("李1");
        System.out.println("b4+"+b4);
        boolean b5 = cpll.contains("李三");
        System.out.println("b5+"+b5);
        //public boolean isEmpty(): 判断当前集合是否为空。
        boolean b6 = cpll.isEmpty();
        System.out.println("b6"+b6);

        //public int size(): 返回集合中元素的个数。
        int size = cpll.size();
        System.out.println("size"+size);

//        public Object[] toArray(): 把集合中的元素，存储到数组中。
        Object[] arr = cpll.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
// public void clear() :清空集合中所有的元素。但是不删除集合，集合还在
        cpll.clear();
        System.out.println(cpll);
        System.out.println(cpll.isEmpty());;

    }
}
