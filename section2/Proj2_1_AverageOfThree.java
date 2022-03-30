package com.zemoso.java.section2;

import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int average;
        System.out.println("Enter three numbers");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();
        average=(num1+num2+num3)/3;
        System.out.println("Average of three numbers is:"+ average);
    }
}
