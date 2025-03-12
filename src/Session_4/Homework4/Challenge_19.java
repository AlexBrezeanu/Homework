package Session_4.Homework4;

import java.util.Scanner;

public class Challenge_19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter age: ");
        int age = scanner.nextInt();


        String classification = (age < 12) ? "Child" :
                (age >= 12 && age <= 17) ? "Teenager" :
                        (age >= 18 && age <= 64) ? "Adult" : "Senior";


        System.out.println("The person is classified as: " + classification);


        scanner.close();
    }
}
