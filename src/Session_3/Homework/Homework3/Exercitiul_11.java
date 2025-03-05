package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Exercitiul_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu prima valoare (true/false): ");
        boolean PrimaVal = scanner.nextBoolean();

        System.out.println("Introdu a 2 a valoare (true/false): ");
        boolean SecVal = scanner.nextBoolean();

        System.out.println("Negatia primei valori: " + !PrimaVal);
        System.out.println("Negatia valorii secundare: " + !SecVal);

        scanner.close();
    }
}

