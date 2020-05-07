package com.company;

import java.util.ArrayList;

public class dome {

/*
* 方法覆盖重写的注意事项:
* 1 必须保证父子类之间方法的名称相同，参数列表也相同
* @override 写在方法前面用来检测是不是有效的正确覆盖重写
* 这个注释就算不写，只要满足要求也是正确的方法覆盖重写
*
* 2.子类方法的返回值必须【小于等于】父类方法的返回值范围
* 扩展java.lang.object类是所有类的公共最高父类，java.lang.String就是object的子类
* 3 .子类方法的权限必须大于等于父类方法的权限修饰符
* 扩展public>protected> default >private
* default是留空
*
* */
    public static void main(String[] args){
        CD zi=new CD();
        zi.method();


    }
}
