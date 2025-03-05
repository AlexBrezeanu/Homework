package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Exercitiul_12 {
    public static void main(String[] args) {
        Scanner scannerz = new Scanner(System.in);

        System.out.print("introdu un numar: ");
        int nou = scannerz.nextInt();
        System.out.println("valoarea initiala :" + nou);

        nou++;
        System.out.println("increment: " + nou);

        nou--;
        System.out.println("decrement: " + nou);

        scannerz.close();
    }
}
