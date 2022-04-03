package com.zemoso.java.section7.Proj7_2;

public class IceCreamDemo {
    public static void main(String[] args){
        IceCream i1= new IceCream("Pista",120,2);
        IceCream i2= new IceCream("Choco Fudge",150,3);
        i1.addTopping("Sprinkles");
        i1.addTopping("Chocolate coat");
        i2.addTopping("Choco Chips");
        i2.addTopping("Caramel");
        printDetails(i1);
        printDetails(i2);
    }
    public static void printDetails(IceCream iceCream){

        System.out.println(iceCream.getName()+" flavour ice cream have "+iceCream.getNumScoops()
                +" scoops and priced of Rs."+ iceCream.getCost()+" and have toppings : "
                );
        iceCream.printToppings();
        System.out.println();
    }
}
