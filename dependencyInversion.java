package com.company;
//example1******
class Programmer{
    void work(){
    }
}
class Management{
    Programmer programmer;
    void manage(){
        programmer.work();
    }
}
//**************
//Here in example1 management is dependent on the developer
//suppose we have to make some changes in the format of programmer, or we have to add multiple posts
//the code will not work because management is only dependent on programmer
//this can be solved using interface
//example2******
interface employ{
    void work();
}
class Programmer implements  employ{
    void work(){
    }
}
class Management{
    employ employ;
    void manage(){
        employ.work();
    }
}

//*************
// now with tha introduction  of interface employ
// the management is not dependent on the developer
// it is independent
//therefore decoupling is done here for removal of dependencies
public class dependencyInversion {
    //Entities must depend on abstractions, not on concretions. It states
    //that the high-level module must not depend on the low-level module,
    //but they should depend on abstractions.
}
