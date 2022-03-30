package com.zemoso.java.section3;

import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number=sc.nextInt();
        if(number%3==0){
            System.out.println("Number is divisible by 3");
        }else{
            System.out.println("Number is not divisible by 3");
        }
    }
}
