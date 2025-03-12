package Session_4.Homework4;

public class Challenge_9 {
    //Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA". Check if countryOne and countryTwo are equal using the equals() method and print the result. Then change the value of countryTwo to "UK" and check for equality again. Print the result.

    public static void main (String[] args) {
    String countryOne = "USA";
    String countryTwo = "USA";

    System.out.println(" Is countryOne and Two equals? : " + countryOne.equals(countryTwo));

        countryTwo = "uk";

        System.out.println("Are the countries still equal? : " + countryOne.equals(countryTwo));

    }
}
