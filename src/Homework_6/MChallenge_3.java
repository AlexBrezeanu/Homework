package Homework_6;

import java.util.Scanner;

public class MChallenge_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();

        System.out.print("Enter the string to insert: ");
        String insertString = scanner.nextLine();

        System.out.print("Enter the index to insert at: ");
        int index = scanner.nextInt();
        scanner.close();


        StringBuilder sb = new StringBuilder(original);


        if (index < 0 || index > sb.length()) {
            System.out.println("Invalid index! Please enter a valid index.");
        } else {
            sb.insert(index, insertString);
            System.out.println("Modified string: " + sb.toString());
        }
    }
}
