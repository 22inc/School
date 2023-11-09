package com.example.gmnv1;

import java.util.Scanner;

public class GuessMyNumberV1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask the user for the range for the secret number.
        System.out.println("Let's play the Guess My Number game!");
        System.out.println();
        System.out.print("Enter the lower limit of your range: ");
        int lowerLimit = in.nextInt();

        System.out.print("Enter the upper limit of your range: ");
        int upperLimit = in.nextInt();
        System.out.println();

        // Generate a secret number between the lower and upper bounds (inclusive of both).
        int secretNumber = (int) (Math.random() * (upperLimit - lowerLimit + 1)) + lowerLimit;

        System.out.println("Try to guess the secret number between " + lowerLimit + " and " + upperLimit + ". ");
        System.out.print("Enter the first guess: ");

        int userGuess = in.nextInt();
        int numGuesses = 1;
        System.out.println();

        while ( (userGuess != secretNumber) && numGuesses < 10 )
        {
            if (userGuess < secretNumber) {
                System.out.print("Guess number " + numGuesses + " is too LOW. ");
            } else if (userGuess > secretNumber) {
                System.out.print("Guess number " + numGuesses + " is too HIGH. ");
            }

            System.out.print("Enter another guess: ");
            userGuess = in.nextInt();
            numGuesses++;
        }

        System.out.println();
        System.out.println("Congratulations!");
        System.out.println("The secret number is: " + secretNumber);
        System.out.println("Number of guesses: " + numGuesses);
    }
}
