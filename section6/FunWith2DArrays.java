package com.zemoso.java.section6;

import java.util.Scanner;

public class FunWith2DArrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int row;
        int col;
        System.out.println("Enter no. of rows");
        row=sc.nextInt();
        System.out.println("Enter no. of columns");
        col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        twice2DArray(arr);
        print2DArray(arr);

    }
    public static void twice2DArray(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]*=2;
            }
        }
    }
    public static void print2DArray(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
