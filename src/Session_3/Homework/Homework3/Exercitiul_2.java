package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Exercitiul_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("numarul x este: ");
        int x = scanner.nextInt();

        ++x;
        System.out.println("X Increment: " + x);

        --x;
        System.out.println("X decrement: " + x);

        scanner.close();

    }
}
