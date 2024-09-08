package pp_lab1;

import java.util.Scanner;

public class lab1_task5 {
    public static void main(String[] args) {
        String [][] matrix = {
                {"asd", "qwe", "fgh"},
                {"123", "678", "sgd"},
                {"678910", "qwef", "lk678jh"}
        };
        print(matrix);
        String substring = "678";
        int count_of_substring = count_substring(matrix, substring);
        System.out.println(count_of_substring);

    }

    public static int count_substring(String [][] matrix, String substring){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                String current_String = matrix[i][j];
                int index = current_String.indexOf(substring);
                while (index != -1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void print(String [][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
