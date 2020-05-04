package com.company;

public class user {
    private String name;//姓名
    private int money;//余额

    public user(String name, int money) {
        this.name = name;
        this.money = money;
    }



        public user(){

        }
        //显示以
    public void show(){
        System.out.println("我叫："+name+"我有多少钱:"+money);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
