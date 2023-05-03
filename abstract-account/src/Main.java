import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList<>();

        list.add(new SavingAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0;
        for (Account ac : list) {
            sum += ac.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account ac : list) {
            ac.deposit(10.0);
        }

        for (Account ac : list) {
            System.out.printf("Update balance account %d: %.2f%n", ac.getNumber(), ac.getBalance());
        }


    }
}