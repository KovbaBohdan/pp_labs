package pp_lab1.task7;

public class BankAccount {
    private Bank bank;
    private double balance;
    private String acc_name;
    private String currency;

    public BankAccount(String accountHolder, double balance, String currency, Bank bank) {
        this.acc_name = accountHolder;
        this.balance = balance;
        this.currency = currency;
        this.bank = bank;
    }

    public String getAccountHolder() {
        return acc_name;
    }

    public String getCurrency() {
        return currency;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public void plus_money(double amount){
        this.balance += amount;
    }

    public void minus_money(double amount){
        this.balance -= amount;
    }

    public void money_operation(BankAccount receiver, double amount){
        if(this.bank == receiver.bank){
            if(this.acc_name == receiver.acc_name){
                this.minus_money(amount);

            }
        }
    }

}
