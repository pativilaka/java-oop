import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double highest = 0.0;
        int position = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > highest){
                highest = numbers[i];
                position = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", highest);
        System.out.println("POSICAO DO MAIOR VALOR = " + position);

        sc.close();

    }
}