package Session_3.Homework.Homework3;

public class Challenge_7 {
    public static void main(String[] args) {


        int intValue = 2;
        double doubleValue = 3.2;


        double sum = intValue + doubleValue;
        double diferenta = intValue - doubleValue;
        double inmultire = intValue * doubleValue;
        double impartire = intValue / doubleValue;


        System.out.println("Valoarea Int : " + intValue);
        System.out.println("Valouarea double : " + doubleValue);
        System.out.println("Sum (int + double): " + sum);
        System.out.println("Diferenta (int - double): " + diferenta);
        System.out.println("Inmultire (int * double): " + inmultire);
        System.out.println("Impartire (int / double): " + impartire);

        // Cand se executa operatii aritmetice intre un int si un double, rezultatul v-a fi stocat ca un double, int ul v-a fi transformat intr un double si operatia se executa in double precision.

        // Partea 2

        byte byte1 = 45;
        byte byte2 = 75;
        byte rezultat = (byte) (byte1 + byte2); // Aparent operatia necesita casting special

        System.out.println("Byte 1: " + byte1);
        System.out.println("Byte 2: " + byte2);
        System.out.println("Suma (casting): " + rezultat);

        // Nu putem stoca un int intr un byte fara casting special
        // Rezultatul este int chiar daca ambele variabile erau byte
        // Fiecare byte este automat transformat intr un int inainte de operatia aritmetica

    }

}
