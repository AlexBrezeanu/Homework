package Session_4.Homework4;

public class Challenge_17 {
    public static void main(String[] args) {

        boolean hasUsername = true;
        boolean hasPassword = true;


        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        }

        else if (!hasUsername || !hasPassword) {
            System.out.println("Authentication failed");
        }

        if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }
    }
}
