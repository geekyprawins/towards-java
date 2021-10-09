package com.praveenvarma;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Start from 1!");
                    break;
                case 1:
                    printAL();
                    break;
                case 2:
                    addALItem(s.nextLine());
                    break;
                case 3:
                    modifyALItem();
                    break;
                case 4:
                    removeALItem(s.nextInt());
                    break;
                case 5:
                    System.out.println(findItem(s.nextLine()));
                    quit = true;
                    break;


            }

        }


    }

    private static ArrayList<String> myAL = new ArrayList<String>();

    public static void addALItem(String item) {
        myAL.add(item);
    }

    public static void printAL() {
        System.out.println("AL size is: " + myAL.size());
        for (int i = 0; i < myAL.size(); i++) {
            System.out.println(i + 1 + ": " + myAL.get(i));
        }

    }

    public static void modifyALItem() {
        int pos = s.nextInt();
        s.nextLine();
        String newItem = s.nextLine();
        myAL.set(pos, newItem);
    }

    public static void removeALItem(int pos) {
        String item = myAL.get(pos);
        myAL.remove(pos);
    }

    public static String findItem(String searchItem) {

//        boolean exists = myAL.contains(searchItem);
        int pos = myAL.indexOf(searchItem);
        if (pos >= 0)
            return myAL.get(pos);
        return null;

    }

}
