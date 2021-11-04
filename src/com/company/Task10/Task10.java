package com.company.Task10;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        String[] daysName = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Day[] days = new Day[6];


        for (int i = 0; i < days.length; i++) {


            days[i] = new Day(daysName[i], new Weather(new Random().nextInt(22), true, false, false, 12));

            System.out.println(days[i]);
        }
    }
}
