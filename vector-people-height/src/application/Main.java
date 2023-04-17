package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double  sum = 0.0;
        double sumMinor = 0.0;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] person = new Person[n];

        for (int i = 0; i < person.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            person[i] = new Person(name, age, height);
            sum += person[i].getHeight();

            if (person[i].getAge() < 16){
                sumMinor += 1;
            }
        }

        double avg = sum / person.length;
        System.out.printf("Altura média: %.2f%n", avg);

        double percentMinor = sumMinor / person.length * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentMinor);

        for (int i = 0; i < person.length; i++){
            if (person[i].getAge() < 16){
                System.out.println(person[i].getName());
            }
        }

        sc.close();
    }
}