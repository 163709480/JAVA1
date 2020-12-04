package com.company.demo01;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionlearn {
    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
//        System.out.println(list);
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);

        Collections.shuffle(list);//打乱集合顺序
        System.out.println(list);




        }

}
