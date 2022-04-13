package com.zemoso.java.assignments.assignment5;

public class main {
    public static void main(String[] args) {
        class1 p=new class1();
        p.print();
        //p.printLocal();
        class2 s=new class2();
        s.getEmail();
    }
}
class class2{
    String aadhar;

    public static class2 setAadhar(String aadhar) {
        //    this.aadhar = aadhar;
        return new class2();
    }

    public void getEmail() {
        System.out.println(this.aadhar);
    }
}
class class1{
    Character gender;
    int age;
    public void print(){
        System.out.print(this.age+" "+this.gender);
    }
//    public void printlocal(){
//        int mobile;
//        String email;
//        System.out.println("mobile number is: "+mobile+" and email""+email);
//    }
    //we can't print local variables without initializing them
}
