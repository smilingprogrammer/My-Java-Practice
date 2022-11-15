package com.company;

import java.util.Scanner;

public class MyLoop {

    public static void main(String[] args){

//        int rate = 10;
//        int maxHours = 20;
//        Scanner scanner = new Scanner(System.in);
//        double hoursWorked = scanner.nextDouble();
//
//        while (hoursWorked > maxHours || hoursWorked < 1){
//            System.out.println("Not Verified");
//            hoursWorked = scanner.nextDouble();
//        }
//
//        double salary = rate * hoursWorked;
//        System.out.println("Verified, your pay is $" + salary);
//        scanner.close()


        Scanner scanner = new Scanner(System.in);
        boolean repeat;

        do{
            System.out.println("Enter yor first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter your second number");
            int num2 = scanner.nextInt();

            int total = num1 + num2;
            System.out.println("Sum of both number is "+total);

            System.out.println("Do you want to try again?");
            repeat = scanner.nextBoolean();
        } while (repeat);

        scanner.close();
    }
}
