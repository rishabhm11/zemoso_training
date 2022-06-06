public class Main {
    public static void main(String[] args){
        Car sportsCar= new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println();

        Car classicCar =new MuscleCar(new BasicCar());
        classicCar.assemble();
        System.out.println();
    }
}
