package com.praveenvarma;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static MobilePhone mobilePhone = new MobilePhone("123 456 789");

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
        // Phone numbers
        boolean exit = false;
        startPhone();
        printOptions();
        while (!exit) {
            System.out.println("Enter action number:  ");
            int action = s.nextInt();
            s.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down....");
                    exit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewCtct();
                    break;
                case 3:
                    updateCtct();
                    break;
                case 4:
                    removeCtct();
                    break;
                case 5:
                    queryCtct();
                    break;
                case 6:
                    printOptions();
                    break;


            }


        }

    }

    private static void startPhone() {
        System.out.println("Started Phone!");
    }

    private static void printOptions() {
        System.out.println("\nOptions available:\n" + "0 - to exit\n " + "1 - to print\n" + "2 - to add \n" + "3 - to update\n" + "4 - to delete\n" + "5 - query contact\n" + "6 - print actions\n");

        System.out.println("Choose action: ");
    }

    private static void addNewCtct() {
        System.out.println("Enter new name: ");
        String name = s.nextLine();
        System.out.println("Enter the number: ");
        String number = s.nextLine();
        Contacts newCtct = Contacts.createContact(name, number);
        if (mobilePhone.addNewContact(newCtct)) {
            System.out.println("Added!");
        } else {
            System.out.println("Cannot add!");
        }
    }

    private static void updateCtct() {
        System.out.println("Enter existing name: ");
        String name = s.nextLine();
        Contacts existingCtCt = mobilePhone.queryContact(name);
        if (existingCtCt == null) {
            System.out.println("Not found!");

            return;
        }
        System.out.println("Enter new name: ");
        String Newname = s.nextLine();
        System.out.println("Enter new number: ");
        String number = s.nextLine();
        Contacts newCtct = Contacts.createContact(Newname, number);
        if (mobilePhone.updateContact(existingCtCt, newCtct)) {
            System.out.println("Updated!");
        } else System.out.println("Failed!");


    }

    private static void removeCtct() {
        System.out.println("Enter existing name: ");
        String name = s.nextLine();
        Contacts existingCtCt = mobilePhone.queryContact(name);
        if (existingCtCt == null) {
            System.out.println("Not found!");

            return;
        }

        if (mobilePhone.removeContact(existingCtCt)) {
            System.out.println("Removed!");
        } else System.out.println("Error");
    }

    private static void queryCtct() {
        System.out.println("Enter existing name: ");
        String name = s.nextLine();
        Contacts existingCtCt = mobilePhone.queryContact(name);
        if (existingCtCt == null) {
            System.out.println("Not found!");

            return;
        }
        System.out.println(existingCtCt.getName() + "-->" + existingCtCt.getContact());

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
