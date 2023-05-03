package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Account acc = new Account(1001, "Pati", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0,500.0);

        //Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Ale", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 0.01);


        //Downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //Temos que ficar atento pois acc3 recebe instancia SavingAccount que não tem
        //relação nenhuma com BusinessAccount.
        //BusinessAccount acc5 =  (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Load");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updated");
        }

        Account acc10 = new Account(10023, "Alex", 1000.0);
        acc10.withdraw(200.0);
        System.out.println(acc10.getBalance());

        Account acc11 = new SavingsAccount(10024, "Alex", 1000.0,0.02);
        acc11.withdraw(200.0);
        System.out.println(acc11.getBalance());

        Account acc12 = new BusinessAccount(10025, "Ale", 1000.00, 5000.0);
        acc12.withdraw(200.0);
        System.out.println(acc12.getBalance());
    }
}