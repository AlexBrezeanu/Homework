package Session_5.Homework_S5;

import java.util.Scanner;

public class Challenge_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;


        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum of entered numbers (excluding -1)= " + sum);
        scanner.close();
    }
}
