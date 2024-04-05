/***

 A program which creates a game which asks a user for a number between 1 and 7. It then displays what day of the week correlates
 to that number.

* @author  Aidan H

* @version 1.0

* @since   04-05-2025

*/

import java.util.Scanner;
//Imports the scanner object

public class WeekdayGuessingGame {
    
    public static void main(String[] args) {

        boolean running = true;
        //Creates a parameter to keep while loop running
        Scanner sc = new Scanner(System.in);
        //Creates a new scanner

        System.out.println("Welcome to a Weekday Guessing Game!");

        while (running) {
            System.out.println("Enter a number from 1 - 7! Alternatively, enter 'q' to quit:");
            //Asks user to enter a number for the game or to quit if they are not willing to play

             int userInputInt = sc.nextInt();
            //Allows user input of numbers for the guessing game

            if (userInputInt == 1) {
                System.out.println("The day of the week you have selected is: Sunday!");
                System.out.println("Thanks for playing the guessing game!");
            }
            //If the user enters 1, display "The day is Sunday!"

            if (userInputInt == 2) {
                System.out.println("The day of the week you have selected is: Monday!");
                System.out.println("Thanks for playing the guessing game!");
            }
            //If the user enters 2, display "The day is Monday!"

            if (userInputInt == 3) {
                System.out.println("The day of the week you have selected is: Tuesday!");
                System.out.println("Thanks for playing the guessing game!");
            }
            //If the user enters 3, display "The day is Tuesday!"

            if (userInputInt == 4) {
                System.out.println("The day of the week you have selected is: Wednesday!");
                System.out.println("Thanks for playing the guessing game!");
            }
            //If the user enters 4, display "The day is Wednesday!"

            if (userInputInt == 5) {
                System.out.println("The day of the week you have selected is: Thursday!");
                System.out.println("Thanks for playing the guessing game!");
            }
            //If the user enters 5, display "The day is Thursday!"

            if (userInputInt == 6) {
                System.out.println("The day of the week you have selected is: Friday!");
                System.out.println("Thanks for playing the guessing game!");
            }
            //If the user enters 6, display "The day is Friday!"

            if (userInputInt == 7) {
                System.out.println("The day of the week you have selected is: Saturday!");
                System.out.println("Thanks for playing the guessing game!");
            }
            //If the user enters 7, display "The day is Saturday!"

            String userInput = sc.nextLine();
            //Creates variable to let users input their response

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Thank you for playing the guessing game!");
                running = false;
                continue;
            }
            //If user input does not equal "q" the game will continue running

        }

        sc.close();
    }
}