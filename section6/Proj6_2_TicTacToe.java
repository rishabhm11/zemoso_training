package com.zemoso.java.section6;
import java.util.Arrays;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args){
        char arr[][]=new char[3][3];
        startGame(arr);
    }
    public static void startGame(char[][] arr){
        for (char[] row : arr) {
            Arrays.fill(row, ' ');
        }
        inGame(arr);
    }
    public static void inGame(char[][] arr) {
        Scanner sc = new Scanner(System.in);
        char ch = 'X';
        int row;
        int col;
        int counter = 0;
        while (true) {
            System.out.println("Enter row(1-3) and column(1-3) ");
            row = sc.nextInt() - 1;
            col = sc.nextInt() - 1;
            if (row > 2 || row < 0 || col > 2 || col < 0) {
                System.out.println("Enter valid data between 1-3, Inclusive!");
                continue;
            }
            if (arr[row][col] != ' ') {
                System.out.println("Already filled");
                continue;
            }
            arr[row][col] = ch;
            counter++;
            if (ch == 'X') {
                ch = 'O';
            } else if (ch == 'O') {
                ch = 'X';
            }
            printGame(arr);
            char check;
            check = checkWinner(arr);
            if (check != ' ') {
                System.out.println(check + " is the winner!");
                break;
            }
            //check if all slots are filled
            if (counter == 9) {
                System.out.println("Game Over! DRAW!!");
                break;
            }
        }
    }
    public static char checkWinner(char[][] arr){
        //check horizontals
        for(int i=0;i<3;i++){
            if((arr[i][0]==arr[i][1])&&(arr[i][1]==arr[i][2])){
                return arr[i][0];
            }
        }
        //check verticals
        for(int i=0;i<3;i++){
            if((arr[0][i]==arr[1][i])&&(arr[1][i]==arr[2][i])){
                return arr[0][i];
            }
        }
        //check diagonals
        if((arr[0][0]==arr[1][1])&&(arr[1][1]==arr[2][2])){
            return arr[0][0];
        }
        if((arr[0][2]==arr[1][1])&&(arr[1][1]==arr[2][0])){
            return arr[0][2];
        }
        return ' ';
    }
    public static void printGame(char[][] arr){
        System.out.println(arr[0][0]+" | "+arr[0][1]+" | "+arr[0][2]);
        System.out.println("- - - - -");
        System.out.println(arr[1][0]+" | "+arr[1][1]+" | "+arr[1][2]);
        System.out.println("- - - - -");
        System.out.println(arr[2][0]+" | "+arr[2][1]+" | "+arr[2][2]);
    }
}
