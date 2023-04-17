package application;

import entities.Aproved;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = null;
        double sem1, sem2, avg = 0.0;

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Aproved[] aproveds = new Aproved[n];

        for (int i = 0; i < aproveds.length; i++){
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            name = sc.nextLine();
            sem1 = sc.nextDouble();
            sem2 = sc.nextDouble();
            aproveds[i] = new Aproved(name, sem1, sem2);
        }

        for (int i = 0; i < aproveds.length; i++){
            avg = (aproveds[i].getSem1() + aproveds[i].getSem2()) / 2;

            if (avg >= 6.0){
                System.out.println(aproveds[i].getName());
            }
        }
        sc.close();

    }
}