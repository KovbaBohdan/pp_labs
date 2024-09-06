package pp_lab1;

import java.util.Scanner;

public class lab1_task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input a number: ");
        int dec_number = console.nextInt();
        String bin_number = "";

        do{
            bin_number += (dec_number % 2);
            dec_number /= 2;

        }while(dec_number != 0);

        print(bin_number);
    }
    public static void print(String s){
        if(s.length() < 8){
            int count_of_zero = 8 - s.length();
            System.out.print(s);
            for(int i = 0; i < count_of_zero; i++){
                System.out.print("0");
            }
            System.out.println();
        }
        else{
            System.out.print(s);
        }

    }
}