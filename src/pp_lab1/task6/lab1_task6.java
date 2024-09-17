package pp_lab1.task6;

import java.util.Scanner;

public class lab1_task6 {
    public static void main(String [] args){
        System.out.println("Choose the currency from the list: UAN, USD, EUR, CAN");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the currency to be converted to another currency: ");
        String firstCurrency = console.nextLine();

        System.out.print("Enter the amount of money to be converted:");
        int amount = console.nextInt();
        console.nextLine();

        System.out.print("Enter the currency to which should be converted: ");
        String secondCurrency = console.nextLine();
        double resultOfConvert = Convertor.convert_currency(firstCurrency, secondCurrency, amount);

        System.out.println("The result of the conversion " + amount + firstCurrency
                + " into " + secondCurrency + " is: " + resultOfConvert);
    }
}
