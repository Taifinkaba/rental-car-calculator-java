package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        // storing each input from our methods
        String pickUpDate = pickUpDate();
        int rentalDays = rentalDays();
        String electronicTollTag = electronicTollTag();
        String gPS = gPS();
        String roadsideAssistance = roadsideAssistance();
        int userAge = userAge();
        double totalCost = totalCost(pickUpDate, rentalDays, electronicTollTag, gPS, roadsideAssistance, userAge);
    }

    // pick up date method
    public static String pickUpDate() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("When will you pick up the car? (MM/DD/YYYY)");
        String pickUpDate = myScanner.nextLine();

        return pickUpDate;

    }

    // rental days method
    public static int rentalDays() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many days will you be renting the car for?");
        int rentalDays = myScanner.nextInt();

        return rentalDays;

    }

    // electronic toll tag method
    public static String electronicTollTag() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Do you want our Electronic Toll Tag($3.95/day)? (yes/no)");
        String electronicTollTag = myScanner.nextLine();

        return electronicTollTag;
    }

    // gps method
    public static String gPS() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Do you want our GPS($2.95/day)? (yes/no)");
        String gPS = myScanner.nextLine();

        return gPS;

    }

    // road side assistance method
    public static String roadsideAssistance() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Do you want our roadside assistance($3.95/day)? (yes/no)");
        String roadsideAssistance = myScanner.nextLine();

        return roadsideAssistance;
    }

    // age method
    public static int userAge() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter current age: ");
        int userAge = myScanner.nextInt();

        return userAge;

    }

    // total cost calculator method
    public static double totalCost(String pickUpDate, int rentalDays, String electronicTollTag, String gPS, String roadsideAssistance, int userAge) {
        // init cost for basic rental, store add-ons with optional
        double basicTotal = 29.99 * rentalDays, addOns = 0, totalCost = 0, underAgeSurcharge = 0;

        // switch cases to calculate total optional cost
        switch (electronicTollTag.toLowerCase()){
            case "yes" -> {
                addOns += 3.95 * rentalDays;
            }
            case "no" -> {
                // nothing gets added to addOns
            }
            default -> {
                System.out.println("Error: Electronic Toll Tag not detected");
            }
        }

        // switch to add on gps cost
        switch (gPS.toLowerCase()){
            case "yes" -> {
                addOns += 2.95 * rentalDays;
            }
            case "no" -> {
                // nothing gets added to addOns
            }
            default -> {
                System.out.println("Error: GPS not detected");
            }
        }

        // switch to add on road side assistance
        switch (roadsideAssistance.toLowerCase()){
            case "yes" -> {
                addOns += 3.95 * rentalDays;
            }
            case "no" -> {
                // nothing gets added to addOns
            }
            default -> {
                System.out.println("Error: Road Side Assistance not detected");
            }
        }

        // 30% more basic if under 25
        if(userAge < 25) underAgeSurcharge = basicTotal * 0.30;

        // combine all to total cost
        totalCost = basicTotal + addOns + underAgeSurcharge;

        // printout the info user entered
        System.out.printf("Pickup date: %s%n", pickUpDate);
        System.out.printf("Basic car rental: $%.2f%n", basicTotal);
        System.out.printf("Options cost: $%.2f%n", addOns);
        System.out.printf("Underage driver surcharge: $%.2f%n", underAgeSurcharge);
        System.out.printf("Total cost: $%.2f%n", totalCost);

        return totalCost;
    }



}
