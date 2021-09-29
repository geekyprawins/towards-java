package com.praveenvarma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter your Year of Birth : ");
//        int yearOfBirth = scanner.nextInt();
//        scanner.nextLine(); // to handle the next line character i.e., enter key
//        int age = 2021 - yearOfBirth;
//
//
//        System.out.println("Please enter your name : ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old!");

        int numCount = 0;
        int sum = 0;
        while (numCount < 10) {
            int order = numCount + 1;
            System.out.println("Enter number #" + order + " :");
            if (scanner.hasNextInt()) {
                numCount++;
                int userNum = scanner.nextInt();
                sum += userNum;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum of entered numbers is " + sum);

    }
}
