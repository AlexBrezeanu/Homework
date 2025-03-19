package Session_7.Homework;

import java.util.Scanner;

public class Challenge_2 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD): ");

        String Date = scanner.nextLine();

        displayDateComponents(Date);

        scanner.close();

    }
    public static void displayDateComponents(String Date){

        if (Date.length() == 10 && Date.charAt(4) == '-' && Date.charAt(7) == '-') {
            String year = Date.substring(0, 4);
            String month = Date.substring(5, 7);
            String day = Date.substring(8, 10);

            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        } else {
            System.out.println("Invalid date format! Please enter in YYYY-MM-DD format.");
        }
    }
}
