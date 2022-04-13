package com.zemoso.java.assignments.assignment7;

interface one{
    public void getOne();
}
interface two{
    public void getTwo();
}
interface three{
    public void getThree();
}
interface combo extends one,two,three{
    public void getCombo();
}
class concrete{
    public void display(){
        System.out.println("hello");
    }
}
class end extends concrete implements combo{
    @Override
    public void getOne(){
        System.out.println("Get method of interface one");
    }
    public void getTwo(){
        System.out.println("Get method of interface two");
    }
    public void getThree(){
        System.out.println("Get method of interface three");
    }
    public void getCombo(){
        System.out.println("Get method of interface combo");
    }
    public void method1(one one){
        System.out.println("Method1");
    }
    public void method2(two two){
        System.out.println("Method2");
    }
    public void method3(three three){
        System.out.println("Method3");
    }
    public void method4(combo combo){
        System.out.println("Method4");
    }
}

public class Part3 {
    public static void main(String[] args) {
        end e= new end();
        e.getOne();
        one on=null;
        e.method1(e);
        e.method1(on);
    }
}
