package Session_3.Homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        // Exercise number 1
        System.out.println("This is my first Java homework: ");
        String MyName = "My name is Alex Brezeanu";
        System.out.println(MyName);
        int MyAge = 32;
        System.out.println("My age is " + MyAge);
        String MyFavouriteColor = "Red";
        System.out.println("My Favorite color is " + MyFavouriteColor);

        // Exercise number 2
        int a = 100;
        double b = 12.10d;
        char c = 'c';
        String d = "STRING";
        System.out.println(a + " " + b + " " + c + " " + d);

        // Exercise number 3
        int sum = 10 + 20;
        int dif = 10 - 20;
        int mult = 10 * 20;
        int div = 10 / 20;
        int Modulo = 10 % 20;
        System.out.println("Sum " + sum);
        System.out.println("dif " + dif);
        System.out.println("mult " + mult);
        System.out.println("Modulo " + Modulo);

        // Exercise number 4

        Scanner inputScanner = new Scanner(System.in);

        String nume = inputScanner.nextLine();
        System.out.println("Introdu numele tau: " + nume);

        System.out.println("numarul meu este: ");
        int number = inputScanner.nextInt();
        System.out.println("valoarea numarului meu este: " + number);
    }


}
