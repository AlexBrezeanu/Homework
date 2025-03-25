package Session_9;

import java.util.Scanner;

public class Homework_Coin_Session_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coins = {25, 10, 5, 1};

        System.out.print("Enter an amount between 1 and 99 cents: ");
        int amount = scanner.nextInt();

        if (amount < 1 || amount > 99) {
            System.out.println("Invalid input! Please enter a number between 1 and 99.");
            return;
        }

        System.out.println("Minimum coins needed:");

        for (int coin : coins) {
            if (amount >= coin) {
                int count = amount / coin;
                amount %= coin;
                System.out.println(coin + " cent coin(s): " + count);
            }
        }

        scanner.close();
    }
}
