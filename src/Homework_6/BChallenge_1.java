package Homework_6;

import java.util.Scanner;

public class BChallenge_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);

        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());
        scanner.close();
    }
}
