package com.zemoso.java.section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args){
        PrintWriter pw;
        Scanner sc;
        try{
            sc= new Scanner(new File("src/com/zemoso/java/section8/number.txt"));
            pw= new PrintWriter("src/com/zemoso/java/section8/twiceNumber.txt");
            int num;
            while(sc.hasNext()){
                num= sc.nextInt();
                pw.println(num*2);
            }
            sc.close();
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
