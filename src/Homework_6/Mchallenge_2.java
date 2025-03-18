package Homework_6;

import java.util.Scanner;

public class Mchallenge_2 {
    public static void main(String[] argas) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();


        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII character set

        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                result.append(c);
                seen[c] = true;
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}

