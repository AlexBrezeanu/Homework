package Homework_6;

import java.util.Scanner;

public class BChallenge_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        StringBuilder result = new StringBuilder();


        for (char ch : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println("String without vowels: " + result.toString());

        scanner.close();
    }
}
