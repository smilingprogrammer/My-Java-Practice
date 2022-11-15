package com.company;

import java.util.Scanner;

public class MyLoop {

    public static void main(String[] args){

        int rate = 10;
        int maxHours = 20;
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Not Verified");
            hoursWorked = scanner.nextDouble();
        }

        double salary = rate * hoursWorked;
        System.out.println("Verified, your pay is $" + salary);
    }
}
