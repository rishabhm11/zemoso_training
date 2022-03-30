package com.zemoso.java.section3;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int packageNumber;                      //1-3
        int noOfCoursesEnrolled;                //total number of courses in which student is enrolled
        int finalCost;                          //total cost for all couses
        int baseCost;                           //base cost for each package
        int noOfCoursesInBasePackage;
        int additional;                         //additional cost per course
        System.out.println("Choose package");
        packageNumber= sc.nextInt();
        System.out.println("Enter number of courses you are enrolled");
        noOfCoursesEnrolled= sc.nextInt();
        if(packageNumber==1){
            baseCost=10;
            noOfCoursesInBasePackage=2;
            additional=6;
        }else if(packageNumber==2){
            baseCost=12;
            noOfCoursesInBasePackage=4;
            additional=4;
        }else {
            baseCost=15;
            noOfCoursesInBasePackage=6;
            additional=3;
        }
        if(noOfCoursesEnrolled==noOfCoursesInBasePackage)
            finalCost=baseCost;
        else{
            finalCost=baseCost+(noOfCoursesEnrolled-noOfCoursesInBasePackage)*additional;
        }
        System.out.println("Total Cost is: "+finalCost);
    }
}
