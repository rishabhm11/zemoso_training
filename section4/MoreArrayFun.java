package com.zemoso.java.section4;

import java.util.Scanner;

public class MoreArrayFun {
    public static void main(String[] args){
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i+1;
        }
        for(int number:arr){
            System.out.println(number);
        }
    }
}
