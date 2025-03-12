package Session_4.Homework4;

import java.util.Scanner;

public class Challenge_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the student's test score: ");
        double score = scanner.nextDouble();


        String grade = (score >= 90 && score <= 100) ? "A" :
                (score >= 80 && score < 90) ? "B" :
                        (score >= 70 && score < 80) ? "C" :
                                (score >= 60 && score < 70) ? "D" :
                                        (score >= 0 && score < 60) ? "F" : "Invalid Score";


        System.out.println("The student's grade is: " + grade);


        scanner.close();
    }
}
