package pp_lab1;

import java.util.Scanner;

public class lab1_task2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter your expression(format: 2 + 4 =): ");
        String exps = console.nextLine();

        System.out.print("Your expression is " + exps + " ");

        if(exps.charAt(1) != ' ' || exps.charAt(3) != ' ' || exps.charAt(5) != ' '){
            System.out.println("You enter invalid expression");
        }

        char symbol1 = exps.charAt(2);

        int number1 = Integer.parseInt(String.valueOf(exps.charAt(0)));
        int number2 = Integer.parseInt(String.valueOf(exps.charAt(4)));

        switch(symbol1){
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;

        }

    }
}
