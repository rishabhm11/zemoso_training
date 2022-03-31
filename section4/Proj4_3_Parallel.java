package com.zemoso.java.section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<String> allNames=new ArrayList<>();
        ArrayList<Integer> allAges=new ArrayList<>();
        String name;
        int age;
        for(int i=0;i<5;i++){
            System.out.println("Enter the name");
            name= sc.nextLine();
            System.out.println("Enter the age");
            age= sc.nextInt();
            allNames.add(name);
            allAges.add(age);
            sc.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println(allNames.get(i)+" is "+allAges.get(i)+" years old");
        }
    }
}
