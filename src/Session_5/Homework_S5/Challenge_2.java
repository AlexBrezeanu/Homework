package Session_5.Homework_S5;

import java.util.Scanner;

public class Challenge_2 {
    public static void main(String[] args){

        System.out.println("Introdu numarul lunii in care esti nascut/a: ");

        Scanner scanner = new Scanner(System.in);
        int Luna = scanner.nextInt();


        switch(Luna){
            case 1 :
                System.out.println("Esti nascut in luna Ianuarie");
            break;
            case 2 :
                System.out.println("Esti nascut in luna Februarie");
                break;
            case 3 :
                System.out.println("Esti nascut in luna Martie");
            break;
            case 4 :
                System.out.println("Esti nascut in luna Aprilie");
            break;
            case 5 :
                System.out.println("Esti nascut in luna Mai");
            break;
            case 6 :
                System.out.println("Esti nascut in luna Iunie");
            break;
            case 7 :
                System.out.println("Esti nascut in luna Iulie");
                break;
            case 8 :
                System.out.println("Esti nascut in luna August");
                break;
            case 9 :
                System.out.println("Esti nascut in luna Septembrie");
                break;
            case 10:
                System.out.println("Esti nascut in luna Octombrie");
                break;
            case 11:
                System.out.println("Esti nascut in luna Noiembrie");
                break;
            case 12:
                System.out.println("Esti nascut in luna Decembrie");
                break;
            default :
                System.out.println("Eroare! Luna gresita!");
                break;


        }
    }
}
