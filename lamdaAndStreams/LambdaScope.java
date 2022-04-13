package com.zemoso.java.lamdaAndStreams;

public class LambdaScope extends SuperScope {
    private String member ="GRANDPA";
    interface Family{
        String who (String member);
    }
    public void testMember(String member){
        System.out.println("local member : "+member );
        System.out.println("family member : "+this.member );
        System.out.println("local member : "+super.member );

        Family familyLambda = (familyMember) ->{
            System.out.println("local Lambda member : " + familyMember);
            System.out.println("local lambda member : " + member);
            System.out.println("local Lambda this.member : " + this.member);
            System.out.println("local Lambda super.member : " + super.member);
            return familyMember;
        };
        familyLambda.who("Vishal");
        // this shows that this and super keyword holds the same value for both mehtod or class
        // and the lambda expression
    }

    public static void main(String[] args) {
        new LambdaScope().testMember("Son");
    }
}
