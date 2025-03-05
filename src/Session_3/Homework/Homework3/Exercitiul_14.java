package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Exercitiul_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valMin = 1;
        int valMax = 100;

        System.out.println("Introdu un numar: ");
        int numar = scanner.nextInt();

        if (numar >= valMin && numar <= valMax) {
            System.out.println("Valoarea numarului " + numar + " se afla in parametrii (" + valMin + "-" + valMax + ")");
        }
        else {
            System.out.println("Numarul ales: " + numar + " nu se afla in parametrii (" + valMin + "-" + valMax + ")");
        }

        scanner.close();
    }
}
