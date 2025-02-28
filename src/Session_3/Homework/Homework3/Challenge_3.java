package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Challenge_3 {
    public static void main (String[] args) {
        // Exercitiul 3

        int z = 2;

        System.out.println("numarul este z");
        boolean estepozitiv = z > 0;
        boolean estenegativ = !estepozitiv;
        if (estepozitiv) {
            System.out.println("numarul este pozitiv");
        } else if (estenegativ) {
            System.out.println("numarul este negativ");
        } else {
            System.out.println("numarul este 0");
        }

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
