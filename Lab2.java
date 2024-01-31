// Programmers:  Amari Piper, Ricky Johnson
// Course:  CS 212
// Due Date: 2/4/202
// Lab Assignment: 2
// Problem Statement: Write a Java program for the Quick Play function from the lottery vending machine.
// Data In: User's Name
// Data Out: User's name, user's estimated winnings, ticket numbers
// Credits: N/A

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat frmt = new DecimalFormat("00");
        DecimalFormat frmt2 = new DecimalFormat("$###,###,###");

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");
        String customerName = input.next();

        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 6; j++){
                System.out.print(frmt.format(rand.nextInt(100)) + " ");
            }
            System.out.println();
        }
        System.out.println("_________________________________________");
        System.out.println("Good Luck, " + customerName);
        System.out.println("Your estimated winnings are " + frmt2.format(prize));
        System.out.println("_________________________________________");


    }
}
