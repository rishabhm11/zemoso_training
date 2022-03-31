package com.zemoso.java.section5;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<String> firstNames= new ArrayList<>();
        ArrayList<String> lastNames= new ArrayList<>();
        String name;
        String firstName;
        String lastName;
        for(int i=0;i<5;i++){
            System.out.println("Enter FullName "+ (i+1));
            name=sc.nextLine();
            int spaceIndex= name.indexOf(" ");
            firstName= name.substring(0,spaceIndex);
            lastName= name.substring(spaceIndex+1);
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(firstNames.get(i)+" "+lastNames.get(j));
            }
        }
    }
}
