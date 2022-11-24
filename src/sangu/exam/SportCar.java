package sangu.exam;

public class SportCar extends CarDecorator {

    public SportCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}