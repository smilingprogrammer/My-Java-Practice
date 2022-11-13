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
        System.out.println("Sales number");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        int bonus = 250;
        int salary = 200;
        int minSale = 9;

        int totalSalary = bonus + salary;
        if(sales > minSale){
            System.out.println("Your Total salary is" + totalSalary);
        } else {
            System.out.println("No salary available for you");
        }
    }
}
