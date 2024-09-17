package pp_lab1.task7;
import pp_lab1.task6.Convertor;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private Bank bank;
    private double balance;
    private String accName;
    private String currency;
    private String accNumber;
    private static List<String> allAccounts = new ArrayList<String>();

    public BankAccount(String accountHolder, double balance, String currency, Bank bank, String accNumber) {
        boolean isAccount = false;
        for(int i = 0; i < allAccounts.size(); i++){
            if(allAccounts.get(i).equals(accNumber)){
                isAccount = true;
                System.out.println("This account is already in the bank");
                break;
            }
        }
        if(!isAccount) {
            this.accName = accountHolder;
            this.balance = balance;
            this.currency = currency;
            this.bank = bank;
            this.accNumber = accNumber;

            allAccounts.add(accNumber);
        }

    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String acc_number){
        this.accNumber = acc_number;
    }

    public String getAccountHolder() {
        return accName;
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

    public void plusMoney(double amount){
        this.balance += amount;
    }

    public void minusMoney(double amount){
        this.balance -= amount;
    }

    public void money_operation(BankAccount receiver, double amount){
        double tax;
        if(this.bank == receiver.bank){
            if(this.accName == receiver.accName){
                tax = 0;
            }
            else{
                tax = 3;
            }
        }
        else{
            if(this.accName == receiver.accName){
                tax = 2;
            }
            else{
                tax = 6;
            }
        }
        System.out.println("Taxes for this money operation is: " + tax + "%");
        double totalAmount = amount + amount * (tax/100);
        double convertedAmount = amount;

        if(!(this.currency == receiver.currency)){
            convertedAmount = Convertor.convert_currency(this.currency, receiver.getCurrency(), amount);
        }
        System.out.println("The total amount(amount + tax) is: " + totalAmount);
        this.minusMoney(totalAmount);
        receiver.plusMoney(convertedAmount);
    }
}
