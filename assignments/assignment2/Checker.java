package com.zemoso.java.assignments.assignment2;


public class Checker {
    public static boolean checkAtoZ(String s){
        s=s.toLowerCase();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=(int)(ch-'a');
            if(index<0||index>25){
                continue;
            }
            arr[index]++;
        }
        for(int e:arr){
            if(e==0){
                return false;
            }
        }
        return true;
    }
}
