package com.company.demo01;
/*
*
* 如何才能知道一个父类引用的对象，本来是什么子类
* 格式；
* 对象  instanceof 类名称
* 这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
* */
public class instanceo {
    public static void main(String[] args) {
        Animal animal= new dog(); //本来是一只猫
        animal.eat();//猫吃鱼


        //如果希望用子类特有方法，需要向下转型。
        //判断一下父类引用animal本来是不是dog
        if(animal instanceof dog){
            dog dg=(dog)animal;
            dg.wathhouse();
        }
        //判断以下animal本来是不是cat
        if(animal instanceof ZI){
            ZI zi=(ZI)animal;
            zi.catchmouse();

        }
        giveme(new dog());
    }
    public static void giveme(Animal animal){

        if(animal instanceof dog){
            dog dg=(dog)animal;
            dg.wathhouse();
        }
        if(animal instanceof ZI){
            ZI zi=(ZI)animal;
            zi.catchmouse();

        }
    }

}
