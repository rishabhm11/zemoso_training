package com.zemoso.java.section6;

import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double d;
        System.out.println("Enter a double value");
        d=sc.nextDouble();
        System.out.println(square(d));
    }
    public static double square(double num){
        return num*num;
    }
}
