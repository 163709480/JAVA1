package com.company.demo01;
/*
* 场景说明：
*       红包发出去之后，所有人都有红包，大家抢完了之后，最后一个红包给群主自己。
*
* 红包策略
* 1.普通红包（平均）:totalMoney / totalCount,余数放在最后一个红包当中。
* 2.手气红包（随机）：最少一分钱，最多不超过平均十的二倍，应该是越发越少
*
* 要做的事情：
*   1.设置程序标题，通过构造方法的字符串参数
*   2.设置群主名称
*   3.设置分发策略：平均，还是随机
* */

public class Bootstrap {
    public static void main(String[] args) {
            MYred red= new MYred("i");
            //设置群主名称
            red.setOwnerName("test");
            //普通红包
            OpenMode normal= new NormalMode();
            red.setOpenWay(normal);
    }

}
