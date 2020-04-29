package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private HashMap<Integer,String>coinnames=new HashMap<Integer,String>();

    public Main(){
        coinnames.put(1,"penny");
        coinnames.put(10,"peny");
        coinnames.put(25,"pey");
        coinnames.put(50,"pny");
        coinnames.put(50,"pn11y");
        System.out.println(coinnames.keySet().size());
        System.out.println(coinnames);
        for(Integer k:coinnames.keySet()){
            String s=coinnames.get(k);
            System.out.println(s);
        }
    }



    public String getname(int amount){
        if(coinnames.containsKey(amount))
        {
            return coinnames.get(amount);
        }else
        {
            return "NOT found";
        }
    }



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int amount=in.nextInt();
        Main coin =new Main();
        String name=coin.getname(amount);
        System.out.println(name);
//

    }

}
