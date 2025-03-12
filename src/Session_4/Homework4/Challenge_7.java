package Session_4.Homework4;

public class Challenge_7 {
    public static void main(String[] args) {
        int sideOne = 5, sideTwo = 5, sideThree = 5;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
                (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" :
                        "Scalene";

        System.out.println("The triangle is: " + triangleType);
    }
}

