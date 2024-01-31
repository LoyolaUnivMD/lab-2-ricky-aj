// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

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
