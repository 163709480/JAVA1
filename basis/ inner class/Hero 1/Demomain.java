package com.company.demo01;

public class Demomain {
    public static void main(String[] args) {
        //创建一个英雄角色
        hero hero= new hero();
        //name  age
        hero.setName("伊利丹");
        hero.setAge(20);

        //new 武器对象
        Weapon weapon= new Weapon("多兰");
        //配置武器
        hero.setWeapon(weapon);
        hero.attack();

    }
}
