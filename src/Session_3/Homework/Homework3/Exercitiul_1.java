package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Exercitiul_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        double num1 = scanner.nextDouble();

        System.out.println(" Introduceti al 2 lea numar: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double diferenta = num1 - num2;
        double inmultire = num1 * num2;
        double impartire = num1 / num2;
        double modulo = num1 % num2;

        System.out.println("\nResults:");
        System.out.println("Adunare: " + suma);
        System.out.println("Scadere: " + diferenta);
        System.out.println("Inmultire: " + inmultire);
        System.out.println("Impartire: " + impartire);
        System.out.println("Modulo: " + modulo);

        scanner.close();

    }
}
