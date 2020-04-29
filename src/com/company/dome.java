package com.company;

import java.util.ArrayList;

public class dome {

    private ArrayList<CD>listCD=new ArrayList<CD>();
    private ArrayList<DVD>listDVD=new ArrayList<DVD>();
    public void add(CD cd){
        listCD.add(cd);
    }
    public void add(DVD dvd){
        listDVD.add(dvd);
    }

    public void list(){
        for(CD cd:listCD){
            cd.print();
        }
        for(DVD dvd:listDVD){
            dvd.print();
        }
    }
    public static void main(String[] args){
        dome cd=new dome();
        cd.add(new CD("CD"+"a", "b", 4, 5,"c"));

        cd.add(new DVD("DVD"+"www","3333",4,"dd"));
        cd.list();


    }
}
