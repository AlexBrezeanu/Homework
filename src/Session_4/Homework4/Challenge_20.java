package Session_4.Homework4;

import java.util.Scanner;

public class Challenge_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);


        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}


