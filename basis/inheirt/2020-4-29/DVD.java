package com.company;

public class DVD extends item{

    private String artist;

    private int num;




    public DVD(String title, String artist, int num,int playingtime, String comment) {
        super(comment,title,playingtime,false);
//        this.title = title;

        this.artist = artist;
        this.num = num;
//        this.comment = comment;
    }


    public void print() {
        System.out.println("DVD");
        super.print();
        System.out.println(num);

    }
}
