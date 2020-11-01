package demo03;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型默认为object类型
        GenericClass gc= new GenericClass();
        gc.setName("只能是字符串");


        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer>gc2= new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3=new GenericClass<>();
        gc3.setName("你好");
        String name1 = gc3.getName();
        System.out.println(name1);
    }
}
