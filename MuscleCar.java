public class MuscleCar extends CarDecorator{
    public MuscleCar(Car car){
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Muscle Car features");
    }
}
