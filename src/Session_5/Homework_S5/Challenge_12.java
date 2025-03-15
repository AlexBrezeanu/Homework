package Session_5.Homework_S5;

import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number <= 5) {
                continue;
            }

            sum += number;
        }

        System.out.println("The sum of numbers greater than 5 is: " + sum);

        scanner.close();
    }
}
