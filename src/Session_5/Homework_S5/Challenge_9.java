package Session_5.Homework_S5;

public class Challenge_9 {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 34, 47, 56, 63, 78, 64, 75, 89};

        for (int num : numbers) {
            String type = (num % 2 == 0) ? "Even" : "Odd";
            System.out.print(num + " - " + type + " " + ";");
        }
    }
}
