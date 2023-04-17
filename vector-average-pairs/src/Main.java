import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int sumPairs = 0;
        int qtdPairs = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();

            if (numbers[i]%2 == 0){
                sumPairs += numbers[i];
                qtdPairs += 1;
            }
        }

        if (qtdPairs == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double avg = sumPairs / qtdPairs;
            System.out.printf("MEDIA DOS PARES = %.1f", avg);
        }

        sc.close();

    }
}