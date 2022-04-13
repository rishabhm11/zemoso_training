package com.zemoso.java.lamdaAndStreams;


public class ConstructorReferences {
    static class Movie{
        //constructor 1
        public Movie(int id){

        }
        //constructor 2
        public Movie(int id, String name){

        }
        interface MovieFactory{
            public Movie CreateMovie(int id);
        }
        MovieFactory m1= i ->new Movie(i); //this is simply invoking constructor for lambda expression
        //we can also use constructor reference to create lambda ex
        MovieFactory m2= Movie::new;
        // there will be a doubt of which constructor is called as there are two of them
        //it depends on the lambda expression as the method of lambda ex takes only one input as integer
        //and when these parameters match each other , that constructor is called
        //so what if we want to call the 2nd constructor as a reference ,lets create another interface which
        //has method containing two parameter with same variable typer
        interface MovieFactory2{
            public Movie CreateMovie2(int id,String name);
        }
        //let's create constructor reference for 2nd constructor
        MovieFactory2 m3= Movie::new;
    }
}
