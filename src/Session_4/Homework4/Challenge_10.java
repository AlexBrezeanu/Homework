package Session_4.Homework4;

import java.util.ArrayList;

public class Challenge_10 {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Glock21");
        listOne.add("AK-47");
        listOne.add("RPG");


        ArrayList<String> listTwo = listOne;


        listOne.add("Dessert Eagle");


        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);

        //Both lists point to the same object in memory so list two is not a new list but a reference to list one.
    }
}
