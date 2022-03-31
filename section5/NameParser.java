package com.zemoso.java.section5;

//import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name;
        System.out.println("Enter your fullname");
        name=sc.nextLine();
        int spaceIndex= name.indexOf(" ");
        String firstName= name.substring(0,spaceIndex);
        String lastName= name.substring(spaceIndex+1);
        System.out.println("Firstname: "+firstName.toUpperCase());
        System.out.println("Lastname: "+lastName.toLowerCase());
    }
}
