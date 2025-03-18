package Homework_6;

import java.util.Scanner;

public class MChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String target = scanner.nextLine();

        System.out.print("Enter the replacement substring: ");
        String replacement = scanner.nextLine();

        scanner.close();


        String modifiedString = replaceSubstring(originalString, target, replacement);


        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceSubstring(String str, String target, String replacement) {
        StringBuilder result = new StringBuilder(str);
        int index = result.indexOf(target);

        while (index != -1) {
            result.replace(index, index + target.length(), replacement);
            index = result.indexOf(target, index + replacement.length()); // Move to next occurrence
        }

        return result.toString();
    }

}
