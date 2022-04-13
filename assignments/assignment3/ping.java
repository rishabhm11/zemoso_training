package com.zemoso.java.assignments.assignment3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ping {
    public static void act(ArrayList<String> al) throws Exception{
        ProcessBuilder build= new ProcessBuilder(al);
        Process process= build.start();
        BufferedReader input= new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader error= new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String s = null;
        System.out.println("Standard output: ");
        while((s = input.readLine()) != null)
        {
            System.out.println(s);
        }
        System.out.println("error (if any): ");
        while((s = error.readLine()) != null)
        {
            System.out.println(s);
        }
    }
}
