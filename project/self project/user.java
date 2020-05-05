package com.company;

public class user {
    private String user;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int money;

    public user(String user, int money) {
        this.user = user;
        this.money = money;
    }
    public  user(){

    }
    public void sea(){
        System.out.println("我叫"+user+"我有"+money+"钱");
    }


}
