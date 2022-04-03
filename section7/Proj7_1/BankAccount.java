package com.zemoso.java.section7.Proj7_1;

public class BankAccount {
        private String owner;
        private int balance;
        public BankAccount(String owner){
            balance=0;
            this.owner=owner;
        }
        public BankAccount(String owner, int balance){
            if(balance<=0){
                System.out.println("Invalid input");
            }else{
                this.balance=balance;
                this.owner=owner;
            }
        }
        public void deposit(int amount){
            if(amount<=0){
                System.out.println("Deposit amount greater than 0");
            }else{
                balance+=amount;
                System.out.println("Amount successfully credited");
            }
        }
        public void withdraw(int amount){
            if(amount<=0){
                System.out.println("Withdraw amount greater than 0");
            }else{
                if(balance-amount<0){
                    System.out.println("Account Balance is less than the withdrawal request");
                }else{
                    balance-=amount;
                    System.out.println("Amount successfully debited");
                }

            }
        }
        public String getOwner(){
            return owner;
        }
        public int getBalance(){
            return balance;
        }


}
