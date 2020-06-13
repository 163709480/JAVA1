package com.company.demo01;

public class Demomain {
    public static void main(String[] args) {
        Hero hero= new Hero();
        hero.setName("ickey");

        //设置技能
//        hero.setSkill(new Skillimp());//使用单独定义的实现类

        //使用匿名内部类

        Skill skill= new Skill() {
            @Override
            public void use() {
                System.out.println("pia");
            }
        };
        hero.setSkill(skill);
        //进一步简化,同时使用匿名内部类和匿名对象
//        hero.setSkill(new Skill() {
//            @Override
//            public void use() {
//                System.out.println("biu pia biu  pia");
//            }
//        });

        hero.attack();


        System.out.println("===========================");


        name na= new name();
        na.setName("dong");
        na.setIn33t(new in());
        na.attack();

    }
}
