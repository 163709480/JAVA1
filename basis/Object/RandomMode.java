package com.company.demo01;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode  implements  OpenMode{
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer>list= new ArrayList<>();
        //随机分配
        //最少一分钱，最多不超过剩下金额平均数的2倍
        //第一次发红包，随机范围是0.01-6.66元
        //第一次发完之后，剩下的至少是3.34元
        //此时还需要再发两个红包
        //此时的再发范围应该是0,01-3.3.34元(取不到右边剩下0,01)

        //公式是 1+random.netInt(  leftMoney /  leftCount * 2);
        Random r= new Random();//创建一个随机数生成器
        //totalMoney是总金额,totalCount是总份数，不变
        //额外定义两个变量，分别代表剩下多少钱，剩下多少份
        int leftMoney= totalMoney;
        int leftCount= totalCount;
        for(int i=0;i<totalCount-1;i++){


        }

        return list;
    }
}
