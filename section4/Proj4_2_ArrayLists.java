package com.zemoso.java.section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Double> al= new ArrayList<>();
        System.out.println("Enter number 0 or more");
        double input;
        while(true){
            input=sc.nextDouble();
            if(input<0) {
                break;
            }
            al.add(input);
        }
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
    }
}
