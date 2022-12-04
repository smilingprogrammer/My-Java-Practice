package com.company;

import java.util.Scanner;

public class Array {

    //Day of the week Array exercise
    public static Scanner scanner = new Scanner(System.in);
    static String days[] = new String[7];

    public static void main(String[] args){

        String arrayDays[] = daysArray();
        System.out.println("Enter array number to print");
        int dayToPrint = scanner.nextInt();

        System.out.println("Today is " + arrayDays[dayToPrint]);
    }

    public static String[] daysArray(){
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        return days;
    }

}
