package com.zemoso.java.section3;

import java.util.Random;

public class diceRoll {
    public static void main(String[] args){
        Random random =new Random();
        int diceValue;
        System.out.println("10 dice values are:");
        for(int i=0;i<=10;i++){
            diceValue=random.nextInt(6)+1;
            System.out.println(diceValue);
        }
    }
}
