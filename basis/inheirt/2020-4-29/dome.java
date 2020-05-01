package com.company;

import java.util.ArrayList;

public class dome {

//    private ArrayList<CD>listCD=new ArrayList<CD>();
//    private ArrayList<DVD>listDVD=new ArrayList<DVD>();
    private ArrayList<item>listitem=new ArrayList<item>();

//    public void add(CD cd){
//        listCD.add(cd);
//    }
//    public void add(DVD dvd){
//        listDVD.add(dvd);
//    }
    public void add(item item)
    {
        listitem.add(item);
    }

//    public void list(){
//        for(CD cd:listCD){
//            cd.print();
//        }
//        for(DVD dvd:listDVD){
//            dvd.print();
//        }
//
//    }

    public void list(){
        for(item cd:listitem){
            cd.print();
        }
    }
    public static void main(String[] args){
        dome cd=new dome();
        cd.add(new CD("CD"+"a", "b", 4, 5,"c"));
        cd.add(new DVD("222","111",3,3,"33"));

        cd.list();


    }
}
