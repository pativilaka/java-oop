package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char deposit = sc.next().charAt(0);

        double value = 0.0;
        Account account;

        if ((deposit == 'Y') || (deposit == 'y')){
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            account = new Account(name, accountNumber, value);
        } else {
            account = new Account(name, accountNumber);
        }
        System.out.println();

        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        account.deposit(value);
        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdrawal(value);
        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println();



        sc.close();
    }
}