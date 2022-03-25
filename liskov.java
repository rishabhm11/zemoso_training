package com.company;

interface carService{
    public void engineOil();
    public void serviceHistory();
}
class electricCar implements carService{
    public void engineOil(){
        throw new AssertionError("Engine oil slot doesn't exist");
    }
    public void serviceHistory(){
        //logic
    }
}
// Here we can see the class electricCar cannot be a substitute for class carService,
// so it violates the liskov substitution principle
class petrolCar implements carService{
    public void engineOil(){
        System.out.println("Engine oil changed");
    }
    public void serviceHistory(){
        //logic
    }
}
// Here class petrolCar can be a perfect substitute for class carService
public class liskov {
    //The liskov substitute principle states that if class one is a subtype of class two
    //then we should be able to replace class two with class onw without interrupting the behaviour of the program
}
