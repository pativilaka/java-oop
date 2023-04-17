import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double avg = sum / numbers.length;

        System.out.println("MEDIA DO VETOR = " + avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < avg){
                System.out.printf("%.1f%n", numbers[i]);
            }
        }

        sc.close();

    }
}