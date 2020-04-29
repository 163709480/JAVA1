package com.company;

public class DVD {
    private String title;
    private String test;
    private int num;

    public DVD(String title, String test, int num, String comment) {
        this.title = title;
        this.test = test;
        this.num = num;
        this.comment = comment;
    }

    private boolean golte=false;
    private String comment;

    public void print() {
        System.out.println(title+":"+test);

    }
}
