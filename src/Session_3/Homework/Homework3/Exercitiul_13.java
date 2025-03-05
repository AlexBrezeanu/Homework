package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Exercitiul_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu pretul initial: ");
        double pretoriginal = scanner.nextDouble();

        System.out.println("Introdu procentul de reducere: ");
        double procentdiscount = scanner.nextDouble();


        System.out.println("Pretul la reducere este: " + (pretoriginal -= (pretoriginal * procentdiscount) / 100));
    }
}

