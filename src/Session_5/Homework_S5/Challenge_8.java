package Session_5.Homework_S5;

public class Challenge_8 {
    public static void main (String[] args){

        System.out.println("The first 10 numbers in the Fibonacci Series are: ");

        int first = 0;
        int second = 1;

        for(int i=0;i<10;i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
     }
}

