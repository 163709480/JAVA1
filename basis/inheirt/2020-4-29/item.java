package com.company;

public class item {
    private int playingtime;
    private boolean golte=false;

    public item(String comment,String title ,int playingtime, boolean golte ) {
        super();
        this.playingtime = playingtime;
        this.golte = golte;
        this.comment = comment;
        this.title = title;
    }

    private String comment;
    private String title;




//    public void setTitle(String title){
//        this.title = title;
//    }





    public void print() {
        System.out.println(title);

    }
}
