package Session_4.Homework4;

public class Challenge_8 {
    public static void main(String[] args) {
        int number = 120;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
