package entities;

public class SavingsAccount extends BankAccount{
    private Integer taxReturnDay;

    public SavingsAccount(){}

    public SavingsAccount(String client, Integer numberAccount, Float balance, Integer taxReturnDay) {
        super(client, numberAccount, balance);
        this.taxReturnDay = taxReturnDay;
    }

    public Integer getTaxReturnDay() {
        return taxReturnDay;
    }

    public void calcNewBalance(Float tax){
        if (taxReturnDay < 10) {
            float value = getBalance() * (tax/100) ;
            deposit(value);
        } else {
            float value = (getBalance() * (tax/100) + 100);
            deposit(value);
            System.out.println("Well done!!");
        }

    }
}
