package sangu.exam;

import java.util.Date;

public class BasicCar implements Car {
    private int doors;
    private String model;
    private Date assembleDate;

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getAssembleDate() {
        return assembleDate;
    }

    public void setAssembleDate(Date assembleDate) {
        this.assembleDate = assembleDate;
    }
}
