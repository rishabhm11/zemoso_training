package com.zemoso.java.assignments.assignment7;

class Cycle{
    public  void balance(){
        System.out.println("Balancing differs as per the cycle's type");
    }
    public void demo(){
        System.out.println("heyy");
    }
};
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Balancing is hardest");
    }
    public void demo2(){
        System.out.println("hello");
    }
};
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Balancing is tough ");
    }
}
class Tricycle extends Cycle{

// public void balance(){
//    System.out.println("No requirement of balancing ");
//}
}

public class Part2 {
    public static void main(String[] args) {
        Cycle[] obj = new Cycle[3];
        obj[0] = (Cycle) new Unicycle();
        obj[0].balance();
        obj[1] = (Cycle) new Bicycle();
        obj[1].balance();
        obj[2] = (Cycle) new Tricycle();
        obj[2].balance();
        Unicycle c1=(Unicycle) obj[0];
        c1.balance();
        Bicycle c2=(Bicycle) obj[1];
        c2.balance();
        Tricycle c3=(Tricycle) obj[2];
        c3.balance();
    }
}
