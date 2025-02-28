package Session_3.Homework.Homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        // Exercitiul 1
        int x = 20;
        int y = 10;

        System.out.println("Adunare: " + (x + y));
        System.out.println("Scadere: " + (x - y));
        System.out.println("Inmultire: " + (x * y));

        if (y != 0) {
            System.out.println("Impartire: " + (x / y));
            System.out.println("Modulus " + (x % y));
        } else {
            System.out.println("impartirea si modulus la 0 nu este permisa");
        }

        int lungime = 5;
        double latime = 3.2;
        double suprafata = lungime * latime;

        System.out.println("Suprafata dreptunghiului este: " + suprafata);

        // Exercitiul 2

        int z = 2;

        z++;
        System.out.println("increment: " + z);

        z--;
        System.out.println("decrement: " + z);

        System.out.println("Numarul este Z: " + z);
        System.out.println("Reversia lui Z: " + -z);

        // Exercitiul 3

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

        // Exercitiul 4

        int i;

        System.out.println("Numaratoarea ");

        for (i=1; i <= 10; i++) {
        System.out.println(i +" ");}

        System.out.println("Numaratoare inversa ");
        for (i=10; i >=1; i--) {
            System.out.println(i + " ");
        }

        //Scanner scannerz = new Scanner(System.in); // Eroare dat faptului ca sunt 2 scannere in acelasi fisier

        //System.out.print("introdu un numar: ");
        //int nou = scannerz.nextInt();
        //System.out.println("valoarea initiala :" + nou);

        //nou++;
        //System.out.println("increment: " + nou);

        //nou--;
        //System.out.println("decrement: " + nou);

        //scannerz.close();

        // Exercitiul 5

        int a = 10;

        System.out.println("valoarea initiala " + a);

        System.out.println("a +=2 = " + (a+=2));
        System.out.println("a -=6 = " +(a-=6));
        System.out.println("a *=2 = " + (a*=2));
        System.out.println("a /=2 = " + (a/=2));
        System.out.println("a %=4 = " + (a%=4));
        System.out.println("a &=5 = " + (a&=5));
        System.out.println("a |=4 = " + (a|=4));
        System.out.println("a ^=3 = " + (a^=3));

        int pretoriginal = 300;
        int procentdisount = 30;
        System.out.println("pretul dupa discount este: " + (pretoriginal -= (pretoriginal * procentdisount)/100));



        Scanner scannerx = new Scanner(System.in);

        System.out.println("Introdu primul numar: ");
        int primulnumar = scannerx.nextInt();

        System.out.println("introdu al doilea numar: ");
        int al2leanumar= scannerx.nextInt();

        if (primulnumar > al2leanumar){
            System.out.println("Primul numar este mai mare");
        } else if (primulnumar < al2leanumar) {
            System.out.println("Al doilea numar este mai mare");
        } else {
            System.out.println("Numerele sunt egale");
        }
        scannerx.close();





    }
}
