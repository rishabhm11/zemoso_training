package com.zemoso.java.section4;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
//        for(int i=0;i<al.size();i++){
//            System.out.println(al.get(i));
//        }
        for(int number:al){
            System.out.println(number);
        }
    }
}
