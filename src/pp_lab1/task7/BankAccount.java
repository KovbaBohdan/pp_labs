package pp_lab1.task7;
import pp_lab1.task6.Convertor;
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
        int tax;
        if(this.bank == receiver.bank){
            if(this.acc_name == receiver.acc_name){
                tax = 0;
            }
            else{
                tax = 3;
            }
        }
        else{
            if(this.acc_name == receiver.acc_name){
                tax = 2;
            }
            else{
                tax = 6;
            }
        }
        double convertedAmount = amount;
        if(!(this.currency == receiver.currency)){
            //double conversionRate = this.bank.getConversionRate(this.currency, receiver.getCurrency());
            convertedAmount = Convertor.convert_currency(this.currency, receiver.getCurrency(), amount);
        }
    }

}
