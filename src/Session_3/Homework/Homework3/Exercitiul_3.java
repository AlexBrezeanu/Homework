package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Exercitiul_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("numarul z este: ");
        double z = scanner.nextDouble();

        if (!(z < 0)) {
            System.out.println("numarul este pozitiv");
        } else {
            System.out.println("numarul este negativ");
        }
        scanner.close();
    }
}




