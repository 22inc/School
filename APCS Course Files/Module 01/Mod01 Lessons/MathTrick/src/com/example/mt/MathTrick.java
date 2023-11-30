package com.example.mt;

/**
*
* Does a trick that gives you a string from specific random numbers.
*
* @author Malik Hassan
* @version 11/30/2023
*/

import java.util.Random;
import java.util.Scanner;

public class MathTrick {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNumber = generateRandomNumber();
        System.out.println("The starting number: " + startingNumber);

        int reversedNumber = reverseDigits(startingNumber);
        System.out.println("The reversed number: " + reversedNumber);

        int difference = subtractNumbers(Math.max(startingNumber, reversedNumber), Math.min(startingNumber, reversedNumber));
        System.out.println("The difference is: " + difference);

        int reversedAndAdded = reverseAndAdd(difference);
        System.out.println("The reverse number added to the difference: " + reversedAndAdded);

        int finalResult = performMathTrick();
        System.out.println("Number x on million: " + finalResult);

        String replacedString = replaceDigitsWithLetters(finalResult);
        System.out.println("Number subtraced and converted to String: " + replacedString);

        String reversedString = convertToMessage(finalResult);
        System.out.println("Replaced string: " + reversedString);
    }


    public static int generateRandomNumber() {
        Random rand = new Random();
        int firstDigit = rand.nextInt(9) + 1;
        int secondDigit = rand.nextInt(10);
        int thirdDigit = (firstDigit - secondDigit > 1) ? secondDigit + 1 : secondDigit - 1;

        return Integer.parseInt("" + firstDigit + secondDigit + thirdDigit);
    }

    public static int reverseDigits(int number) {
        String numStr = String.valueOf(number);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return Integer.parseInt(reversedStr);
    }

    public static int subtractNumbers(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public static int reverseAndAdd(int number) {
        int reversed = reverseDigits(number);
        return number + reversed;
    }

    public static int performMathTrick() {
        int randomNumber = generateRandomNumber();
        int reversedNumber = reverseDigits(randomNumber);
        int subtractedResult = subtractNumbers(Math.max(randomNumber, reversedNumber), Math.min(randomNumber, reversedNumber));
        int reversedAndAdded = reverseAndAdd(subtractedResult);
        return (reversedAndAdded * 1_000_000) - 733_361_573;
    }

    public static String replaceDigitsWithLetters(int number) {
        String numberStr = String.valueOf(number);
        String replacedStr = numberStr
                .replace('0', 'Y')
                .replace('1', 'M')
                .replace('2', 'P')
                .replace('3', 'L')
                .replace('4', 'R')
                .replace('5', 'O')
                .replace('6', 'F')
                .replace('7', 'A')
                .replace('8', 'I')
                .replace('9', 'B');
        return replacedStr;
    }

    public static String convertToMessage(int number) {
        String reversedMessage = new StringBuilder(replaceDigitsWithLetters(number)).reverse().toString();
        return reversedMessage;
    }
}
