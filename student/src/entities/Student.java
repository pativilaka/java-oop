package entities;

public class Student {
    public String name;
    public double nota01;
    public double nota02;
    public double nota03;

    public double finalGrade(){
        return nota01 + nota02 + nota03;
    }

    public double missingPoints() {
        if (finalGrade() < 60) {
            return 60 - finalGrade();
        }
        return 0;
    }

    public String passFailed(){
        if (finalGrade() < 60){
            return "FAILED";
        } else {
            return "PASS";
        }
    }

    public String toString(){
        return "FINAL GRADE = "
                + String.format("%.2f", finalGrade())
                + "\n"
                + passFailed();
    }
}
