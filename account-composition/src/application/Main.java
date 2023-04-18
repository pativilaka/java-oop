package application;

import entities.BankAccount;
import entities.SavingsAccount;
import entities.SpecialAccount;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        BankAccount ba = new BankAccount("Pati", 123, 2000f);
        System.out.println(ba.showData());

        System.out.println();
        ba.deposit(5000f);
        System.out.println(ba.showData());

        System.out.println();
        ba.whithdrow(100f);
        System.out.println(ba.showData());

        System.out.println();
        ba.whithdrow(7000f);
        System.out.println(ba.showData());

        System.out.println("----------------------------------------------------");
        SavingsAccount sa = new SavingsAccount("Ale", 1558, 5000f, 11);
        System.out.println(sa.showData());

        System.out.println();
        sa.calcNewBalance(5f);
        System.out.println(sa.showData());

        System.out.println("----------------------------------------------------");
        SpecialAccount sp = new SpecialAccount("Paula", 158, 400f, 1000f);
        sp.whithdrow(300f);
        System.out.println(sp.showData());

        System.out.println();
        sp.whithdrow(1200f);
        System.out.println(sp.showData());

        System.out.println();
        sp.whithdrow(500f);
        System.out.println(sp.showData());




    }
}