package Homework_6;

import java.util.Scanner;

//Word Capitalizer
//Description: Capitalize the first letter of every word in a sentence using StringBuilder.
public class BChallenge_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        String capitalizeSentence = capitalizeWords(input);

        System.out.println("Capitalized sentence: " + capitalizeSentence);

    }

    public static String capitalizeWords(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : sentence.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                ch = Character.toUpperCase(ch);
                capitalizeNext = false;
            }
            result.append(ch);
        }

        return result.toString();
    }
}
