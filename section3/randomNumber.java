package com.zemoso.java.section3;

import java.util.Random;

public class randomNumber {
    public static void main(String[] args){
        Random random =new Random();
        int aRandomNumber;
        aRandomNumber= random.nextInt();
        System.out.println("random number is: "+aRandomNumber);
        aRandomNumber= random.nextInt(1000);  //0-999
        System.out.println("random number between 0-999: "+aRandomNumber);
        aRandomNumber= random.nextInt(1000)+1;   //0-1000
        System.out.println("random number between 0-1000: "+aRandomNumber);
    }
}
