package com.company;

import java.util.ArrayList;

public class dome {

    private ArrayList<CD>listCD=new ArrayList<CD>();
    public void add(CD cd){
        listCD.add(cd);
    }
    public void list(){
        for(CD cd:listCD){
            cd.print();
        }
    }
    public static void main(String[] args){
        dome cd=new dome();
        cd.add(new CD("a", "b", 4, 5,"c"));
        cd.list();


    }
}
