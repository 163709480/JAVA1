# JAVA1
笔记
containsKey:判定是否包含指定键名
<cd> listcd  
  (CD cd)
  list.add

Overide
方法覆盖重写的注意事项:
* 1 必须保证父子类之间方法的名称相同，参数列表也相同
* @override 写在方法前面用来检测是不是有效的正确覆盖重写
* 这个注释就算不写，只要满足要求也是正确的方法覆盖重写
*
* 2.子类方法的返回值必须【小于等于】父类方法的返回值范围
* 扩展java.lang.object类是所有类的公共最高父类，java.lang.String就是object的子类
*3 .子类方法的权限必须大于等于父类方法的权限修饰符
* 扩展public>protected> default >private
* default是留空


先有父类的内容再有子类的内容（super）
  * 1.子类构造方法当中有一个默认隐含的 super() 调用，所以一定是先调用的父类构造，后执行子类构造
  * 2.可以通过super关键字来子类构造调用父类重载
  * 3.super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造
  * 4.子类必须调用父类构造方法，不写则赠送super(),写了则用写的指定super调用,“super只能用一个，还必须是第一个”。
