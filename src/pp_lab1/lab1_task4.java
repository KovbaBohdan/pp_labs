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
        return "Символ: " + symbol + ", Кількість: " + count;
    }
}

public class lab1_task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи рядок: ");
        String user_string = console.nextLine();

        char[] characters = user_string.toCharArray();
        UniqueSymbolCount[] charCounts = new UniqueSymbolCount[characters.length];
        boolean[] counted = new boolean[characters.length];

        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                charCounts[uniqueCount++] = new UniqueSymbolCount(characters[i], count);
            }
        }

        // Виведення результату
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(charCounts[i]);
        }
    }
}
