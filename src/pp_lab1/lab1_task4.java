package pp_lab1;

import java.util.Scanner;

class UniqueSymbolCount {
    private char symbol;
    private int count;

    public UniqueSymbolCount(char character, int count) {
        this.symbol = character;
        this.count = count;
    }

    public char getCharacter() {
        return symbol;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Symbol: " + symbol + ", Count: " + count;
    }
}

public class lab1_task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String user_string = console.nextLine();

        char[] characters = user_string.toCharArray();
        UniqueSymbolCount[] char_counts = new UniqueSymbolCount[characters.length];
        boolean[] counted = new boolean[characters.length];

        int unique_count = 0;

        for (int i = 0; i < characters.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                char_counts[unique_count++] = new UniqueSymbolCount(characters[i], count);
            }
        }

        for (int i = 0; i < unique_count; i++) {
            System.out.println(char_counts[i]);
        }
    }
}
