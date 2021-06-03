package com.praveenvarma;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digits in 125 is "+DigitSum(125));
        System.out.println(DigitSum(2));
        System.out.println(DigitSum(-10));
    }

    public static int DigitSum(int number) {
        if (number >= 10) {
            int digitSum = 0;
            int lastDigit;
            while (number > 0) {
                lastDigit = number % 10;
                number /=  10;
                digitSum += lastDigit;

            }
            return digitSum;

        }
        return -1;
    }
}
