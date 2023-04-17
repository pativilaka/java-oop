package entities;

public class Aproved {

    private String name;
    private double sem1;
    private double sem2;

    public Aproved(String name, double sem1, double sem2) {
        this.name = name;
        this.sem1 = sem1;
        this.sem2 = sem2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSem1() {
        return sem1;
    }

    public void setSem1(double sem1) {
        this.sem1 = sem1;
    }

    public double getSem2() {
        return sem2;
    }

    public void setSem2(double sem2) {
        this.sem2 = sem2;
    }
}
