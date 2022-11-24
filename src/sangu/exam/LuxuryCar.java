package sangu.exam;

import sangu.exam.parts.CarTV;
import sangu.exam.parts.SmallFridge;

public class LuxuryCar extends CarDecorator {

    SmallFridge smallFridge;
    CarTV tv;
    public LuxuryCar(Car c,SmallFridge smallFridge, CarTV tv) {
        super(c);
        this.smallFridge =smallFridge;
        this.tv = tv;
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}