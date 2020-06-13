package com.company.demo01;

import java.util.ArrayList;
import java.util.List;
/*
* java.util.List正是ArrayList所实现的接口
*
*
* */

public class Demointerface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
    List<String>list = new ArrayList<>();

    List<String> result=addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String>addName(List<String>list){
        list.add("11");
        list.add("222");
        list.add("33");
        return list;
    }

}