package com.zemoso.java.section6;

import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(sumOfArrayList(al));
    }
    public static int sumOfArrayList(ArrayList<Integer> al){
        int sum=0;
        for(int i=0;i<al.size();i++){
            sum+=al.get(i);
        }
        return sum;
    }
}
