package com.zemoso.java.section3;

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random random=new Random();
        int randomNumber;
        randomNumber=random.nextInt(100)+1;
        int guess;
        while(true){
            System.out.println("enter your guess");
            guess=sc.nextInt();
            if(guess==randomNumber){
                System.out.println("Congratulations! You have guessed the right number");
                break;
            }else if(guess>100||guess<0){
                System.out.println("That was a waste of guess! Pick a number between 0 to 100, inclusive!");
            }else if(guess<randomNumber){
                System.out.println("You have to guess higher than this");
            }else if(guess>randomNumber){
                System.out.println("You have to guess lower than this");
            }
        }
    }
}
