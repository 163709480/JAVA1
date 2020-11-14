package demo01.Map;
/*
*   JDK9的新特性：
*         List接口,Set接口,Map接口;里面增加了一个静态方法of,可以给集合一次性添加多个元素
*         static <E> list<E> of (E.....  elements)
*         使用前提：
*           当集合中存储元素的个数已经确定了,不在改变时使用
*         注意:
*           1.of方法只适用于list接口,Set接口,Map接口，不适用与接口的实现类
*           2.of方法的返回值是一个不能改变的集合,集合不能再使用add,put方法添加元素,会抛出异常
*           3.Set接口和Map接口再调用of方法的时候，不能有重复的元素,否则会抛出异常
*
*
* */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "d");
        System.out.println(list);
//        list.add("a");//.UnsupportedOperationException:不支持操作异常

//        Set<String> set = Set.of("a", "b", "a", "c", "d");//.IllegalArgumentException 非法参数异常，有重复的元素

        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);
//        set.add("w");//.UnsupportedOperationException不支持操作异常  不能再添加新的元素

        Map<String, Integer> map = Map.of("123", 12, "lisi", 24, "wang", 20,"lisi",19);//.IllegalArgumentException 非法参数异常，有重复的元素
        Map<String, Integer> map1 = Map.of("123", 12, "lisi", 24, "wang", 20);
        map1.put("a",23);//.UnsupportedOperationException不支持操作异常  不能再添加新的元素
        System.out.println(map1);
    }
}
