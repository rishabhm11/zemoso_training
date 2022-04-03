package com.zemoso.java.section7.Proj7_3;

public class CircleDemo {
    public static void main(String[] args){
        Circle c1= new Circle();
        Circle c2= new Circle(4.0);
        c1.setRadius(10.0);
        printDetails(c1);
        printDetails(c2);
    }
    public static void printDetails(Circle circle){
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Circumference: "+circle.circumference());
        System.out.println("Area "+circle.area());
    }
}
