import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdPairs = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]%2 == 0){
                System.out.print(numbers[i]);
                System.out.print(" ");
                qtdPairs += 1;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qtdPairs);

        sc.close();
    }
}