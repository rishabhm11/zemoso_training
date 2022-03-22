package com.company;
abstract class mobile{
    String company;
    String model;
    int price;
    private int imei;
    public void setIMEI(int number) {
        imei=number;
    }
    public void getIMEI() {
        System.out.println(imei);
    }
    void working() {
        System.out.println("mobile is in working state");
    }
    void working(int time) {
        System.out.println("mobile's uptime is "+time+" minutes");
    }
    abstract void covercase();
}
class smartphone extends mobile{
    void working() {
        System.out.println("smartphone is working");
    }
    void covercase() {
        System.out.println("Black covercase");
    }
}

public class oops_concept {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		mobile m= new mobile();
        smartphone s= new smartphone();
        s.working(30);//poly
        s.working();//poly
        s.setIMEI(32143481);//encap
        s.getIMEI();//encap
        s.working();//inheritance
        s.setIMEI(232434534);//inheritance
        s.getIMEI();//inheritance
        s.covercase();//abstraction
        s.working();//abstraction
    }
}
