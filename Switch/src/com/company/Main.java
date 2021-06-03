package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	int switchValue = 3;
	switch (switchValue){
        case 1 :
            System.out.println("The value is one");
            break;
        case 2:
            System.out.println("The value is 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Either 3 4 or 5 ");
            System.out.println("The number is " + switchValue);
            break;
        default:
            System.out.println("None of one or two");
            break;
    }
    // switch only works for byte , short , int , char data types.
        // but now we can use with String too!
        String month = "JANUary";
	switch (month.toLowerCase()){
        case "january":
        case "february":
            System.out.println("The month is now " + month);
            break;
        default:
            System.out.println("Some other month");
            break;

    }
    printDayofTheWeek(5);
	printDayofTheWeek(2);
	printDayofTheWeek(8);

    }
    public static void printDayofTheWeek(int day){
        switch (day){
            case  0 :
                System.out.println("Sunday");
                break;
            case  1 :
                System.out.println("Monday");
                break;
            case  2 :
                System.out.println("Tuesday");
                break;
            case  3 :
                System.out.println("Wednesday");
                break;
            case  4 :
                System.out.println("Thursday");
                break;
            case  5 :
                System.out.println("Friday");
                break;
            case  6 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
