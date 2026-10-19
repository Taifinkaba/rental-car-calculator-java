package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        String pickUpDate = pickUpDate();
        int rentalDays = rentalDays();
        String electronicTollTag = electronicTollTag();
        String gPS = gPS();
        String roadsideAssistance = roadsideAssistance();
        int userAge = userAge();
    }

    public static String pickUpDate() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("When will you pick up the car? (MM/DD/YYYY)");
        String pickUpDate = myScanner.nextLine();

        return pickUpDate;

    }

    public static int rentalDays() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many days will you be renting the car for?");
        int pickUpDate = myScanner.nextInt();

        return pickUpDate;

    }

    public static String electronicTollTag() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Do you want our Electronic Toll Tag($3.95/day)? (yes/no)");
        String electronicTollTag = myScanner.nextLine();

        return electronicTollTag;
    }

    public static String gPS() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Do you want our GPS($2.95/day)? (yes/no)");
        String gPS = myScanner.nextLine();

        return gPS;

    }

    public static String roadsideAssistance() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Do you want our roadside assistance($3.95/day)? (yes/no)");
        String roadsideAssistance = myScanner.nextLine();

        return roadsideAssistance;
    }

    public static int userAge() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter current age: ");
        int userAge = myScanner.nextInt();

        return userAge;

    }


}
