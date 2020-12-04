package demo04;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        System.out.println(list);

        Collections.sort(list);//默认升序
        System.out.println(list);

        ArrayList<String>list02=new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("d");
        list02.add("f");
        list02.add("e");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

    }
}
