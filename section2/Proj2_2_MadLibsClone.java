package com.zemoso.java.section2;

import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name;
        String age;
        String city;
        String company;
        String hometown;
        String desg;
        System.out.println("Enter name");
        name =sc.nextLine();
        System.out.println("Enter your age");
        age =sc.nextLine();
        System.out.println("Enter your city");
        city =sc.nextLine();
        System.out.println("Enter your companies name");
        company =sc.nextLine();
        System.out.println("Where is your hometown");
        hometown =sc.nextLine();
        System.out.println("What is your designation");
        desg =sc.nextLine();
        System.out.println("My name is "+name+" and my age is "+age+", i am currently living in "+city+
                ".I am working in "+company+" as an "+desg+"and my hometown is "+hometown);
    }
}
