package Session_3;

public class Calculator {
    public static void main(String[] args) {

        int valA = 10;
        int valB = 5;
        int rez;
        char op = 'A'; // A S D M

        if (op == 'A') {
            rez = valA + valB;
        } else if (op == 'S') {
            rez = valA - valB;}

        else if (op == 'D') {
            rez = valA / valB;}
        else if (op == 'M') {
            rez = valA * valB;
        } else {
            System.out.println("eroare la operator");
            rez = 0;

    }
    }
    }

