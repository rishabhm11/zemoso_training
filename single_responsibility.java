package com.company;
//example 1*************
class employ1{
    private String name;
    private int id;
    private String Designation;
    protected String Department;

    public void Identity(){
        System.out.println("My name is "+name+" and my id number is "+id+". I am designated as "+Designation+" in "+Department+" deapartment.");
    }
    public void printid(int id){
        System.out.println("---------------------");
        System.out.println("   ID:"+id);
        System.out.println("---------------------");
    }
}
//**********************
//example2**************
class employ2{
    private String name;
    private int id;
    private String Designation;
    protected String Department;

    public void Identity(){
        System.out.println("My name is "+name+" and my id number is "+id+". I am designated as "+Designation+" in "+Department+" deapartment.");
    }
}
class printer{
    public static void printid(int id){
        System.out.println("---------------------");
        System.out.println("   ID:"+id);
        System.out.println("---------------------");
    }
}
//********************
public class single_responsibility {
//the example one is the violation of the single responsibility as it is carrying two functions of different responsibilities
// the example two is the example of how single responsible principle works by dividing up the work.
}
