package com.praveenvarma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        // else we can use the commented code too!
        // int min, max;
        //boolean isFirstValue = true;
        while (true) {
            System.out.println("Enter a number : ");
            if (scanner.hasNextInt()) {
                int inputNum = scanner.nextInt();
//                if (isFirstValue){
//                    isFirstValue = false;
//                    min = inputNum;
//                    max = inputNum;
//                }

                if (inputNum > max)
                    max = inputNum;

                if (inputNum < min)
                    min = inputNum;


            } else break;
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);

    }
}
