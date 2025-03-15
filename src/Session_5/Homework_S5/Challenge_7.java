package Session_5.Homework_S5;

import java.util.Scanner;

public class Challenge_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 32;
        int guess;

        System.out.println("Guess the number (between 1 and 100):");


        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}
