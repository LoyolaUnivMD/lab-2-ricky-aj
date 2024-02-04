// Programmers:  Amari Piper, Ricky Johnson
// Course:  CS 212
// Due Date: 2/4/202
// Lab Assignment: 2
// Problem Statement: Write a Java program for the Quick Play function from the lottery vending machine.
// Data In: User's Name, user's bet
// Data Out: User's name, user's bet, user's winnings, ticket numbers
// Credits: https://ruby.fgcu.edu/courses/mpenderg/ism3230Notes/decimalformatobject.html


// Import all utilities
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.lang.Math;

class Lab2 {
    public static void main(String[] args) {

        // Create import objects
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Create decimal formats
        DecimalFormat lotteryNumber = new DecimalFormat("00");
        DecimalFormat currency = new DecimalFormat("$#,##0.00");

        // Introduce program
        System.out.println();
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        System.out.println();

        // Ask user for name, save as customerName
        System.out.print("What's your name? ");
        String customerName = input.next();
        System.out.println();

        // Ask for user for bet
        System.out.println("How much would you want to play?");
        double bet = input.nextDouble();
        System.out.println();

        // Output user's name and bet in currency format
        System.out.println("Great! " + customerName + " wants to play " + currency.format(bet) + ".");
        System.out.println();

        // Assign prize
        double prize = 0;

        // Generate 10 tickets with 6 numbers each
        System.out.println("Your Lottery Tickets:");
        System.out.println("_________________________________________");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 6; j++){

                // Assign number with a random integer (0-99 inclusive)
                int number = rand.nextInt(100);
                System.out.print(lotteryNumber.format(number) + " ");

                // Determine if number matches any winning numbers (3, 5, 16, 58, 59, 11)
                if (number == 3 || number == 5 || number == 16 || number == 58 || number == 59 || number == 11) {

                    // Winnings calculation (bet to the power of 1.75)
                    prize = prize + Math.pow(bet, 1.75);
                }
            }
            System.out.println(); // Separate lines of tickets

        }

        // Generate good luck message
        System.out.println("_________________________________________");
        System.out.println("Good Luck, " + customerName + "!");
        System.out.println("_________________________________________");
        System.out.println("Your winnings are:");
        System.out.println(currency.format(prize));
        System.out.println("_________________________________________");


    }
}
