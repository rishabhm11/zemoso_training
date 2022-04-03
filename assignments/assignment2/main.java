package com.zemoso.java.assignments.assignment2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        Checker check= new Checker();
        Boolean b=check.checkAtoZ(s);
        if(b){
            System.out.println("All alphabets present");
        }else{
            System.out.println("All alphabets are not present");
        }
    }
}
