package Session_4.Homework4;

public class Challenge_1 {
    public static void main (String [] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";


        if (stringOne == stringTwo) {
            System.out.println("stringOne and stringTwo refer to the same object.");
        } else {
            System.out.println("stringOne and stringTwo refer to different objects.");
        }


        if (stringOne.equals(stringTwo)) {
            System.out.println("stringOne and stringTwo have the same value.");
        } else {
            System.out.println("stringOne and stringTwo have different values.");
        }
    }
}
