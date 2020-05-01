package com.company;

public class CD extends item {

    private String artist;
    private int num;

    public CD(String title, String artist, int num,int playingtime, String comment) {
        super(comment,title,playingtime,false);
       // this.title = title;
        this.artist = artist;
        this.num = num;
//        this.playingtime = playingtime;
//        this.comment = comment;
    }


    public static void main(String[] args){

    }

//    public void print() {
//        System.out.println(title+":"+artist+":"+num+":"+playingtime+":"+comment);
//
//    }
}
