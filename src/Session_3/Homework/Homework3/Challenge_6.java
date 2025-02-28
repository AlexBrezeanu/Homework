package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Challenge_6 {
    public static void main(String[] args) {
        Scanner scannerx = new Scanner(System.in);

        System.out.println("Introdu primul numar: ");
        int primulnumar = scannerx.nextInt();

        System.out.println("introdu al doilea numar: ");
        int al2leanumar = scannerx.nextInt();

        if (primulnumar > al2leanumar) {
            System.out.println("Primul numar este mai mare");
        } else if (primulnumar < al2leanumar) {
            System.out.println("Al doilea numar este mai mare");
        } else {
            System.out.println("Numerele sunt egale");
        }
        scannerx.close();



    }
}
