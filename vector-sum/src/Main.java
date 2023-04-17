import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for(int i = 0; i < vector.length; i++){
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
            sum += vector[i];
        }

        double avg = sum / vector.length;

        System.out.print("VALORES = ");
        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", avg);
        sc.close();
    }
}