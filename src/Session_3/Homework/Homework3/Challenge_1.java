package Session_3.Homework.Homework3;

public class Challenge_1 {
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
    }
}

