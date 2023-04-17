import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vecNumbers = new int[n];

        for(int i = 0; i < vecNumbers.length; i++){
            System.out.print("Digite um numero: ");
            vecNumbers[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < vecNumbers.length; i++){
            if (vecNumbers[i] < 0){
                System.out.println(vecNumbers[i]);
            }
        }

        sc.close();
    }
}