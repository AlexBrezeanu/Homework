package Session_3;

import java.util.Scanner;

public class LogicClassroom {
    public static void main(String[] args) {

        int students = 100;
        int rooms = 10;

        if(rooms != 0 && students !=0){
            System.out.println(" avem sali disponibile");
        }else {
            System.out.println(" nu avem sali si/sau studenti");
        }


        if((rooms != 0 && students !=0 )|| (students / rooms) <= 3){
            System.out.println(" avem sali disponibile");
        }else {
            System.out.println(" nu avem sali si/sau studenti");
        }

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
