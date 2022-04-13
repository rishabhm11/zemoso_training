package com.zemoso.java.lamdaAndStreams;

public class FunctionalInterfaceAnnotation {
    @FunctionalInterface
    interface Cruncher  {
        int crunch (int i , int j);
//        int munch(int i,int j);
        // defining more than one abstract method in interface will result in compiler saying it can not be a
        //functional interface
    };
    public int cruncherServices(int i, int j,Cruncher cruncher ){
        return cruncher.crunch(i,j);
    }
    public static void main(String[] args) {
        FunctionalInterfaceAnnotation client = new FunctionalInterfaceAnnotation();
        int ans = client.cruncherServices(3,4,(p,q)->p*q);
        System.out.println("Answer : " +ans);
    }
}
