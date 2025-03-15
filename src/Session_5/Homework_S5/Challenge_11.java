package Session_5.Homework_S5;

import java.util.Scanner;

public class Challenge_11 {
    //Break Statement
    //Write a program that prompts the user to enter numbers. Calculate the average of these numbers. If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        for(;;) {
            System.out.print("Enter numbers to calculate the average (use 0 to stop): ");
            double number = scanner.nextDouble();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;

            if (count == 0) {
                System.out.println("Error! No numbers entered.");
            } else {
                double average = sum / count;
                System.out.println("The average is: " + average);
            }
        }
    }
}

