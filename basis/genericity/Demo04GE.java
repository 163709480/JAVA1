package demo03;
        /*
        * 测试含有泛型的接口
        * */
public class Demo04GE {
    public static void main(String[] args) {
        //创建GenericInterface对象
        GenericInteripl gill= new GenericInteripl();
        gill.mehotd("2323");

        //创建Genericlnteripl对象
       Genericlnteripl1<Integer> gi1= new Genericlnteripl1<>();
       gi1.mehotd(4);

        Genericlnteripl1<Double> gi2= new Genericlnteripl1<>();
        System.out.println(8.8);
    }
}
