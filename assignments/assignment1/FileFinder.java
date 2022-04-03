package com.zemoso.java.assignments.assignment1;

import java.io.File;
import java.util.Scanner;

public class FileFinder {
    public static void findFile()
    {
        // address to search in
        File file = new File("C:\\Users\\risha\\OneDrive\\Desktop");
        String str ;
        Scanner sc = new Scanner(System.in);
        while(true){
            boolean flag=false;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            str =sc.nextLine();
            //list of file is stored in string
            String[] files = file.list();
            //Iterating through all files in the location provided
            for (String string : files){
                Boolean b = str.equals(string);
                if (b){
                    flag = true;
                    System.out.print("File Found : ");
                    System.out.println(str);
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            if(flag){
                break;
            }else {
                System.out.println("File not find : Reenter the name of the file.");
            }

        }
    }
}
