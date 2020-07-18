package demo03;
/*
*   含有泛型的接口第二种使用方式:接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
*    就相当于定于了一个含有泛型的类，创建对象的时候确定泛型的类型
*       public interface list<E>{
*           boolean add(E e);
*           E get(int index);
*       }
*       public class Arraylist<E> implements List<E>{
*           public boolean add(E e){
*
*           }
*       }
* */
public class Genericlnteripl1<I>  implements GenericInterface<I>{
    @Override
    public void mehotd(I i) {
        System.out.println(i);
    }
}
