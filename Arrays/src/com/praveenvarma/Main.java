package com.praveenvarma;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = new double[10];
        doubleArray[0] = 2.5;
        print(intArray);
        int[] newArray = getArray(5);
        System.out.println("New array is: ");
        for (int i = 0; i < newArray.length; i++)
            System.out.println(newArray[i]);
        System.out.println("The average is: " + getAvg(newArray));
    }

    private static int[] getArray(int i) {
        int[] values = new int[i];
        System.out.println("Enter " + i + " elements now: \r");
        for (int j = 0; j < i; j++)
            values[j] = scanner.nextInt();
        return values;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return (double) sum / (double) arr.length;
    }

    public static int[] sort(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        boolean flag = true;
        while (flag) {

            flag = false;
            for (int i = 0; i < temp.length - 1; i++) {
                // descending order
                if (temp[i] < temp[i + 1]) {
                    // swap
                    temp[i] = temp[i + 1] - temp[i] + (temp[i + 1] = temp[i]);
                    flag = true;

                }
            }
        }
        return temp;

    }
}
