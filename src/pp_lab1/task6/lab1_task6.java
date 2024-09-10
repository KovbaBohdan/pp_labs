package pp_lab1.task6;

import java.util.Scanner;

public class lab1_task6 {
    public static double convert_currency(String f_currency, String s_currency, int money){
        double[] valutes = {41, 1, 0.89, 1.35};
        double from_curr = 0;
        double to_curr = 0;

        if(f_currency.equals("USD")){
            from_curr = valutes[1];
        } else if(f_currency.equals("UAN")){
            from_curr = valutes[0];
        } else if(f_currency.equals("EUR")){
            from_curr = valutes[2];
        } else if(f_currency.equals("CAN")){
            from_curr = valutes[3];
        }

        if(s_currency.equals("USD")){
            to_curr = valutes[1];
        } else if(s_currency.equals("UAN")){
            to_curr = valutes[0];
        } else if(s_currency.equals("EUR")){
            to_curr = valutes[2];
        } else if(s_currency.equals("CAN")){
            to_curr = valutes[3];
        }

        double result = money / from_curr * to_curr;
        return result;
    }

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

        double result_of_convert = convert_currency(first_currency, second_currency, amount);
        System.out.println("The result of the conversion " + amount + first_currency
                + " into " + second_currency + " is: " + result_of_convert);

    }

}
