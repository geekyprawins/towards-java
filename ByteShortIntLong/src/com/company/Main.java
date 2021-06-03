package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myIntMaxValue = Integer.MAX_VALUE;
        int myIntMinValue = Integer.MIN_VALUE;
        System.out.println("Integer max value is " + myIntMaxValue);
        System.out.println("Integer min value is " + myIntMinValue);
        System.out.println("Busted max value = " + (myIntMaxValue + 1));
        System.out.println("Busted min value  = " + (myIntMinValue - 1));
        int myLargestInt = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByteValue);
        System.out.println("Byte max value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = " + myMinShortValue);
        System.out.println("Short max value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLongValue);
        System.out.println("Long max value = " + myMaxLongValue);
        long myLong = 214748364756789L; // add L for long
        System.out.println(myLong);

        int myTotalInt = (myIntMinValue / 2);
        byte myByte = (byte) (myMinByteValue / 2);
        short myShort = (short) (myMinShortValue / 2);
//        // by default java uses int for a whole number so we use casting

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value  = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value  = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int intvalue = 5;
        float floatvalue = 5.25F; // double is the default floating point  type here jus as int , so we need f at the ending
        double doublevalue = 5.25;
        double WeightInPounds = 5;
        double WeightInKgs = 0.45359237 * WeightInPounds;
        System.out.println(WeightInKgs);

        char myFirstChar = 'S';
        char myUnicode = '\u0044';
        System.out.println(myFirstChar);
        System.out.println(myUnicode);
        System.out.println('\u00A9');
        System.out.println('\u092A');
        // for using unicode we need to use "backslash u"

        boolean myTrue = true;
        boolean myFalse = false;
        System.out.println(myTrue);

        String myFirstString = "This is my first string yeah!";
        System.out.println("my first string in Java is " + myFirstString);
        myFirstString = myFirstString + "add more.";
        myFirstString = myFirstString + "\u00A9 copyRight";
        System.out.println(myFirstString);

        String myLastString = "100";
        int myNum = 24;
        myLastString += myNum;
        System.out.println(myLastString);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("Not an alien jeez!");
        double myDouble1 = 20.00;
        double myDouble2 = 80.00;
        double result1 = (myDouble1 + myDouble2) * 100.00;
        double remainder = result1 % 40.00;
        boolean isZeroRemainder = (remainder == 0) ? true : false;
        System.out.println(isZeroRemainder);
        if (!isZeroRemainder)
            System.out.println("Got some remainder");

        int finalScore = calculateScore(true, 5, 200, 1000);
        System.out.println(finalScore);
        finalScore = calculateScore(true, 88, 500, 200);
        System.out.println(finalScore);


        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Praveen", playerPosition);
        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Likitha", playerPosition
        );
        calculateScore("Bob", 50);
        calculateScore(60);
        calculateScore();


    }

    public static int calculateScore(boolean gameOver, int levelCompleted, int score, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Final score is " + finalScore);
            return finalScore;
        }
        return -1;


    }

    public static void displayHighScorePosition(String name, int playerPosition) {
        System.out.println(name + " managed to get into position " + playerPosition + " in the high score table :) ");


    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000)
            position = 1;
        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >= 100)
            position = 3;
        return position;


//
    }

    // Method Overloading => Changing parameters by keeping return type and name as it is.
    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " managed to score " + score);
        return score;


    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player managed to score " + score);
        return score;


    }

    public static int calculateScore() {
        System.out.println("Unknown player managed to score" + " some score!");
        return 0;


    }

}
