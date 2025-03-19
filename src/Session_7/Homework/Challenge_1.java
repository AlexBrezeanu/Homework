package Session_7.Homework;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Challenge_1 {
    public static void main(String[] args){
        displayTodaysDate();
    }

    public static void displayTodaysDate(){

        LocalDate Date = LocalDate.now();

        System.out.println(Date);
    }
}
