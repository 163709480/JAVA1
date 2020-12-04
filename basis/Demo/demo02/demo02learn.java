package demo02;

import java.util.ArrayList;
import java.util.Collections;/*

    public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
 注意
    sort(List<T> list)的前提
    被排序的集合里面存储的元素，必须实现Comparable,重写接口中的方法compareTo定义的排序

    Comparable接口的排序规则:
         自己(this)-参数:升序



*/

public class demo02learn {
    public static void main(String[] args) {
        ArrayList<Person>list03= new ArrayList<>();
        list03.add(new Person("hello",19));
        list03.add(new Person("lis2",43));
        list03.add(new Person("woqu",39));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);
    }
}
