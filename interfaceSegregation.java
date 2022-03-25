package com.company;
//example1*****************
interface dailyRoutine{
    public void eat();
    public void sleep();
    public void code();
    public void dance();
}
class coder implements dailyRoutine{
    @Override
    public void eat() {
        //eating
    }
    public void sleep() {
        //sleeping
    }
    public void code() {
        //coding
    }
    public void dance() {
        //dancing
    }
}
//**********************
//So in this example1 we can see coder have to perform dailyroutine
//but coder doesnt want to dance
//but coder have compulsion to dance because it implements the dailyroutine
// to solve this we have to create multiple interfaces to solve this problem
// lets see with example2
//example2******************
interface eat{
    public void eating();
}
interface sleep{
    public void sleeping();
}
interface code{
    public void coding();
}
interface dance{
    public void dancing();
}
class smartCoder implements eat,sleep,code{
    @Override
    public void eating() {
        //eating
    }
    public void sleeping() {
        //sleeping
    }
    public void coding() {
        //coding
    }
}
//*******************
//so in example2 we have created different interfaces for different task
//this resolves the problem
//now the smartCoder does not have any need to implement dance class
//this satisfies interface segregation
public class interfaceSegregation {
    //The interface segregation states
    //A client should never be forced to implement an interface that it doesn’t use
    //or clients shouldn’t be forced to depend on methods they do not use.
    //in other words, it is not necessary to implement all the properties
    //we should configure it out according to our convenience
}
