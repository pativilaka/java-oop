package entities;

public class Data {
    private char gender;
    private double height;

    public Data(double height, char gender) {
        this.gender = gender;
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
