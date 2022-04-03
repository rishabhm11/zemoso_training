package com.zemoso.java.section7.Proj7_1;

public class BankAccountDemo {
    public static void main(String[] args){
        BankAccount b1= new BankAccount("Rishabh");
        BankAccount b2= new BankAccount("Mehta",1000);
        b1.deposit(5000);
        System.out.println(b1.getOwner()+ "'s account balance is "+ b1.getBalance());
        b1.withdraw(2000);
        System.out.println(b1.getOwner()+ "'s account balance is "+ b1.getBalance());
        b2.deposit(0);
        System.out.println(b2.getOwner()+ "'s account balance is "+ b2.getBalance());
        b2.deposit(10000);
        System.out.println(b2.getOwner()+ "'s account balance is "+ b2.getBalance());
        b2.withdraw(8000);
        System.out.println(b2.getOwner()+ "'s account balance is "+ b2.getBalance());
    }
}
