package Session_4.Homework4;

public class Challenge_18 {
    public static void main(String[] args) {

        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("Array before decrement:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]--;
        }

        System.out.println("Array after decrement:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
