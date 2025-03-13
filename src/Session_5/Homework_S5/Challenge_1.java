package Session_5.Homework_S5;

import java.util.Scanner;

public class Challenge_1 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nr = scanner.nextInt();

        if (nr % 2 ==0) {
            System.out.println("The number is even");
        } else {
                System.out.println("The number is odd");
        }
    }
}
