package Session_5.Homework_S5;

public class Challenge_3 {
    public static void main(String[] args){
        int[] numbers = {3, -1, 7, -4, 0, -8, 5, -2};

        int count = 0;

        for (int num : numbers) {
            if (num < 0) {
                count++;
            }
        }

        System.out.println("Number of negative integers: " + count);
    }
}
