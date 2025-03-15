package Session_5.Homework_S5;

import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        String reversed = new StringBuilder(input).reverse().toString();


        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
