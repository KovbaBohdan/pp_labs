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
        double tax;
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
        System.out.println("Taxes for this money operation is: " + tax + "%");
        double total_amount = amount + amount * (tax/100);
        double converted_amount = amount;

        if(!(this.currency == receiver.currency)){
            converted_amount = Convertor.convert_currency(this.currency, receiver.getCurrency(), amount);
        }
        System.out.println("The total amount(amount + tax) is: " + total_amount);
        this.minus_money(total_amount);
        receiver.plus_money(converted_amount);
    }

}
