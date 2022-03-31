package com.zemoso.java.section4;

import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        //taking input
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number");
            arr[i]= sc.nextInt();
        }
        //printing
        for(int number: arr){
            System.out.println(number*2);
        }
    }
}
