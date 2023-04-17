package entities;

public class Account {

    private String name;
    private int accountNumber;
    private double accountValue;

    public Account(String name, int accountNumber, double accountValue) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountValue = accountValue;
    }

    public Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getInputValue() {
        return accountValue;
    }

    public void deposit(double addValue){
        this.accountValue += addValue;
    }

    public void withdrawal(double removeValue){
        this.accountValue -= removeValue + 5.00;
    }

    @Override
    public String toString() {
        return "Account "
                + getAccountNumber()
                + ", Holder: "
                + getName()
                + ", Balance: $ "
                + String.format("%.2f" , getInputValue());
    }
}
