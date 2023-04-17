import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oldest = 0;
        String nameOldest = null;

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            name[i] = sc.nextLine();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();

            if (age[i] > oldest){
               oldest = age[i];
               nameOldest = name[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nameOldest);

        sc.close();

    }
}