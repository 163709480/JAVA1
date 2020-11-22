package demo01.Map;
/*
*   异常的注意事项
* */

import java.util.List;

public class Demo01Exception1 {
    public static void main(String[] args) {
        /*
        *   多个异常使用捕获又该如何处理呢
        *   1.多个异常分别处理。
        *   2.多个异常一次捕获，多次处理
        *   3.多个异常一次捕获一次处理。
        *
        * */

            //1.多个异常分别处理。
//        try{
//            int[] arr={1,2,3};
//            System.out.println(arr[3]);//
//
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//
//
//        }
//
//
//        try{
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//
//        }
//        System.out.println("后续代码");


//        2.多个异常一次捕获，多次处理
        try{
            int[] arr={1,2,3};
           // System.out.println(arr[3]);//
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3


        }catch (ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            System.out.println(e);


        }catch (IndexOutOfBoundsException e){
        System.out.println(e);

    }
    /*
    *   一个try多个catch注意事项:
    *           catch里面定义的异常变量，如果有子父类关系,那么子类的异常变量必须写在上边,否则就会报错
    *           ArrayIndexOutOfBoundsException e extends IndexOutOfBoundsException
    *
    * */
        try {
            int[] arr = {1, 2, 3};
            // System.out.println(arr[3]);//
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3


        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
            }catch (ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
                System.out.println(e);


            }









}
}
