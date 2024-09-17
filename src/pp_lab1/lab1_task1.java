package pp_lab1;

import java.util.Scanner;

public class lab1_task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input a number: ");
        int decNumber = console.nextInt();
        String binNumber = "";

        do{
            binNumber = (decNumber % 2) + binNumber;
            decNumber /= 2;
        }while(decNumber != 0);

        print(binNumber);
    }
    public static void print(String s){
        if(s.length() < 8){
            int countOfZero = 8 - s.length();
            for(int i = 0; i < countOfZero; i++){
                System.out.print("0");
            }
            System.out.print(s);
            System.out.println();
        }
        else{
            System.out.print(s);
        }
    }
}