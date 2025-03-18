package Homework_6;

import java.util.Scanner;

public class BChallenge_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 syllables to compose a word: ");

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        StringBuilder fs = new StringBuilder(first);
        StringBuilder ss = new StringBuilder(second);

        StringBuilder word = fs.append(ss);

        System.out.println("The final word is: " + word.toString());
    }
}
