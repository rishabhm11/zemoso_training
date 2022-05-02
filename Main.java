public class Main  {
    public static void main(String[] args) {

        //calling form SIM 1
        SimCardManager simCardManager=new SimOne();
        simCardManager.call();


        System.out.println();


        //calling from SIM 2
        SimCardManager simCardManager1=new SimTwo();
        simCardManager1.call();

    }
}