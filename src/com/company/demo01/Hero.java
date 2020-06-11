package com.company.demo01;

public class Hero {

    private String name;// hero is name
    private Skill skill;// hero
    public void attack(){
        System.out.println("我叫"+name+"开始释放技能");
        skill.use();//调用接口中的抽象方法
        System.out.println("技能释放完毕");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Hero() {
    }
}

