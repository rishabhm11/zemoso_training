package com.zemoso.java.section5;

public class StringMethods1 {
    public static void main(String[] args){
        String myName="Rishabh Mehta";
        String anotherName="John Baugh";
        if(myName.compareTo(anotherName)>0){
            System.out.println(myName+" > "+anotherName);
        }else if(myName.compareTo(anotherName)==0){
            System.out.println(myName+" = "+anotherName);
        }else{
            System.out.println(myName+" < "+anotherName);
        }
    }
}
