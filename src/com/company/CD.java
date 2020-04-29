package com.company;

public class CD {
    private String title;
    private String artist;
    private int num;
    private int playingtime;
    private boolean golte=false;
    private String comment;
    public CD(String title, String artist, int num,int playingtime, String comment) {
        this.title = title;
        this.artist = artist;
        this.num = num;
        this.playingtime = playingtime;
        this.comment = comment;
    }


    public static void main(String[] args){

    }

    public void print() {
        System.out.println(title+":"+artist+":"+num+":"+playingtime+":"+comment);

    }
}
