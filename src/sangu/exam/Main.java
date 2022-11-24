package sangu.exam;

import sangu.exam.parts.CarTV;
import sangu.exam.parts.SmallFridge;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportCar(new LuxuryCar(new BasicCar(), new SmallFridge(10), new CarTV("TSL-122")));
        sportsLuxuryCar.assemble();
    }
}