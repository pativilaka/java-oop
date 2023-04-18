package entities;

public class SpecialAccount extends BankAccount{
    private Float limit;

    public SpecialAccount(){}

    public SpecialAccount(String client, Integer numberAccount, Float balance, Float limit) {
        super(client, numberAccount, balance);
        this.limit = limit;
    }

    public Float getLimit() {
        return limit;
    }

    public void setLimit(Float limit) {
        this.limit = limit;
    }

    @Override
    public void whithdrow(Float value) {
        if (((getBalance() + limit) - value) <= 0){
            System.out.println("you cannot withdraw this amount of money");
        } else {
            setBalance(getBalance()-value);
        }
    }
}