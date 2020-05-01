package com.company;

public class CD extends item {
   public CD(){
       //super必须写在第一个
//       super();//调用父类无参构造方法

       super(10);//在调用父类重载的构造方法
       System.out.println("子类");
   }
   public void method(){
       //super();只有子类构造方法,才能调用父类构造方法
   }

}

