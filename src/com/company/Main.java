package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Enter your first number");
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//
//        System.out.println("Enter you second number");
//        double secondNumber = scanner.nextDouble();
//        scanner.close();
//
//        double totalAnswer = firstNumber * secondNumber;
//
//        System.out.println(totalAnswer);


        // Assignment
//        System.out.println("Season of the year");
//        Scanner scanner = new Scanner(System.in);
//        String season = scanner.nextLine();
//
//        System.out.println("Adjective");
//        String adjective = scanner.next();
//
//        System.out.println("Whole Number");
//        int wholeNumber = scanner.nextInt();
//        scanner.close();
//
//        System.out.println("Total of everything is "+wholeNumber+"The season is: "+ season + "The adjective is" + adjective);

        // If statement
//        System.out.println("Sales number");
//        Scanner scanner = new Scanner(System.in);
//        int sales = scanner.nextInt();
//        scanner.close();
//
//        int bonus = 250;
//        int salary = 200;
//        int minSale = 9;
//
//        if(sales > minSale){
//            salary = salary + bonus;
//            System.out.println("Your Total salary is" + salary);
//        } else {
//            System.out.println("No salary available for you");
//        }

        // Assignment of if statements

        System.out.println("Pennies");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();

        System.out.println("nickel");
        double nickel = scanner.nextDouble();

        System.out.println("dime");
        double dime = scanner.nextDouble();

        System.out.println("quarter");
        double quarter = scanner.nextDouble();

        double total = pennies + nickel + dime + quarter;
        scanner.close();
        int exactNumberExpected = 1;

        if (total == exactNumberExpected){
            System.out.println("You win");
        } else if (total > exactNumberExpected){
            System.out.println("You went over");
        } else {
            System.out.println("You went under");
        }
    }
}
