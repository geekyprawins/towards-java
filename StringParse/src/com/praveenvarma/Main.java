package com.praveenvarma;

public class Main {

    public static void main(String[] args) {
        String numAsString = "69";
        System.out.println("numAsString = " + numAsString);
        int number = Integer.parseInt(numAsString);
        System.out.println("Number is " + number);
        numAsString += 1; // 1 is appended to the string
        number += 1; // 1 is added
        System.out.println(numAsString);
        System.out.println(number);
        String doubleAsString = "10.25";
        double doubleNum = Double.parseDouble(doubleAsString);
        System.out.println(doubleAsString);
        System.out.println(doubleNum);
        


    }
}
