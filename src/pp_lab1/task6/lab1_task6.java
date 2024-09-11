package pp_lab1.task6;

import java.util.Scanner;

public class lab1_task6 {
    public static void main(String [] args){
        System.out.println("Choose the currency from the list: UAN, USD, EUR, CAN");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the currency to be converted to another currency: ");
        String first_currency = console.nextLine();

        System.out.print("Enter the amount of money to be converted:");
        int amount = console.nextInt();
        console.nextLine();

        System.out.print("Enter the currency to which should be converted: ");
        String second_currency = console.nextLine();
        double result_of_convert = Convertor.convert_currency(first_currency, second_currency, amount);

        System.out.println("The result of the conversion " + amount + first_currency
                + " into " + second_currency + " is: " + result_of_convert);
    }
}
