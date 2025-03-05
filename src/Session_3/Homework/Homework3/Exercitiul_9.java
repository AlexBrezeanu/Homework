package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Exercitiul_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti valoarea lungimii: ");
        double lungime = scanner.nextDouble();

        System.out.println("Introduceti valoarea latimii: ");
        double latime = scanner.nextDouble();

        double suprafata = lungime * latime;

        System.out.println("Aria dreptunghiului este: " + suprafata);
    }
}
