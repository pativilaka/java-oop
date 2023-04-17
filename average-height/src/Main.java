import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vector = new double[n];
        double soma = 0.0;

        for (int i = 0; i < n; i++){
            vector[i] = sc.nextDouble();
            soma += vector[i];

        }
        double media = soma / n;

        System.out.printf("Average height: %.2f", media);

        sc.close();
    }
}