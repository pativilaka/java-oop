package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stu = new Student();

        stu.name = sc.nextLine();
        stu.nota01 = sc.nextDouble();
        stu.nota02 = sc.nextDouble();
        stu.nota03 = sc.nextDouble();

        System.out.println(stu);

        if (stu.finalGrade() < 60){
            System.out.printf("MISSING %.2f POINTS", stu.missingPoints());
        }

        sc.close();
    }
}