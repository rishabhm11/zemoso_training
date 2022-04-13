package com.zemoso.java.lamdaAndStreams;

interface IMovie{
    public boolean check(int id);
}
public class MethodReference {
    public static boolean isClassic(int movID){
        return true;
    }
    public boolean isTop10(int movID){
        return true;
    }
    public void CheckMovieStaticMethodRef(){
        IMovie m1 = (id)-> id < 100 ? true:false; //we checked whether a movie is calssic or not using lambda ex
        IMovie m2 =MethodReference ::isClassic;//here we do the same checking whether movie is classci or not but
        //we used method reference instead
        //part before  double colon is class name and after colon it is the method name we are referencing to
    }
    //now we will create instance of method reference and then check for the same
    public void CheckInstanceMovieStaticMethodRef(){
        IMovie m1 = (i)->i<100 && i>10 ?true:false;
        MethodReference mr = new MethodReference();
        IMovie m2 = mr::isTop10;
    }
    public static void main(String[] args) {
        MethodReference client = new MethodReference();
    }
}