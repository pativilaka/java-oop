package application;

import entities.Data;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdF = 0;
        double sumF = 0;
        int qtdH = 0;
        double avgF = 0.0;
        double minorHight;
        double highest;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Data[] datas = new Data[n];

        for (int i = 0; i < datas.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da " + (i + 1) + "a pessoa:");
            char gender = sc.next().charAt(0);

            datas[i] = new Data(height, gender);
        }

        minorHight = datas[0].getHeight();
        highest = datas[0].getHeight();
        for (int i = 0; i < datas.length; i++){

            if (datas[i].getHeight() < minorHight){
                minorHight = datas[i].getHeight();
            }

            if (datas[i].getHeight() > highest){
                highest = datas[i].getHeight();
            }
        }

        System.out.printf("Menor altura = %.2f%n", minorHight);
        System.out.printf("Maior altura = %.2f%n", highest);

        for (int i = 0; i < datas.length; i++){
            if ((datas[i].getGender() == 'F') || (datas[i].getGender() == 'f')){
                qtdF += 1;
                sumF += datas[i].getHeight();
            } else {
                qtdH += 1;
            }
        }

        avgF = sumF/qtdF;

        System.out.printf("Media das alturas das mulheres = %.2f%n", avgF);
        System.out.println("Numero de homens = " + qtdH);

        sc.close();
    }
}