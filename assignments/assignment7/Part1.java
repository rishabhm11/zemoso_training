package com.zemoso.java.assignments.assignment7;

abstract class Rodent{
    Rodent(){
        System.out.println("Constructor of Rodent is running.");
    }
    public abstract void eat();
    public abstract void display();

}
class Mouse extends Rodent{
    Mouse(){
        System.out.println("Constructor of Mouse is running.");
    }
    public void eat(){
        System.out.println("Mouse is eating");
    }
    public void display(){
        System.out.println("Hello, I am Mouse");
    }
}
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Constructor of Gerbil is running");
    }
    public void eat(){
        System.out.println("Gerbil is eating");
    }
    public void display(){
        System.out.println("Hello, I am Gerbil ");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Constructor of Hamster is running");
    }
    public void eat(){
        System.out.println("Hamster is eating");
    }
    public void display(){
        System.out.println("Hello, I am Hamster");
    }
}

public class Part1 {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].display();
        rodent[0].eat();
        rodent[1] = new Gerbil();
        rodent[1].display();
        rodent[1].eat();
        rodent[2] = new Hamster();
        rodent[2].display();
        rodent[2].eat();
    }
}
