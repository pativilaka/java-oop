package entities;

public class BankAccount {
    private String client;
    private Integer numberAccount;
    private Float balance;

    public BankAccount(){}

    public BankAccount(String client, Integer numberAccount, Float balance) {
        this.client = client;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public Float getBalance() {
        return balance;
    }

    protected void setBalance(Float balance) {
        this.balance = balance;
    }

    public void whithdrow(Float value){
        if ((balance - value) < 0){
            System.out.println("Sorry, you cannot withdraw this amount of money");
        } else {
            balance -= value;
        }
    }

    public void deposit(Float value){
        balance += value;
    }

    public String showData(){
        StringBuilder sb = new StringBuilder();
        sb.append("Account data: \n");
        sb.append("Name: " + getClient() + "\n");
        sb.append("Number Account: " + getNumberAccount() + "\n");
        sb.append("Balance: $" + String.format("%.2f" , getBalance()));
        return sb.toString();
    }
}
