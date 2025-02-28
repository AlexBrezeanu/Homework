package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Challenge_4 {
    public static void main (String[] args) {
        // Exercitiul 4

        int i;

        System.out.println("Numaratoarea ");

        for (i=1; i <= 10; i++) {
            System.out.println(i +" ");}

        System.out.println("Numaratoare inversa ");
        for (i=10; i >=1; i--) {
            System.out.println(i + " ");
        }

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
