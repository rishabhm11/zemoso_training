package com.zemoso.java.assignments.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class main {
    public static void check(String str){
        String regexPattern ="[A-Z].*[.]";
        boolean flag= Pattern.matches(regexPattern,str);
        if(flag){
            System.out.println("Yes the given pattern matches the regex");
        }else{
            System.out.println("Sorry ! :(   it does not matches the regex");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=scn.nextLine();
        check(str);
    }
}