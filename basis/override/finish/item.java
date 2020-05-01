package com.company;

public class item extends CD{
    //new phone
    @Override
    public void show() {
//        super.show();
        super.show(); //把父类的show方法拿来重复利用
        //子类再添加新内容

//        System.out.println("显示号码");
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
