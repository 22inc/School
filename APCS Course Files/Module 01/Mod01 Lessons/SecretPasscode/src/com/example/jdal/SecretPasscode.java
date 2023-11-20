package com.example.jdal;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode {
    public static void main(String[] args) throws IOException {
        String userChoice = "Y";
        int pwLength = 0;
        String password = "";

        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        while (userChoice.equalsIgnoreCase("Y")) {
            System.out.print("Enter the number of characters for the password (minimum 6): ");
            pwLength = in.nextInt();

            while (pwLength < 6) {
                System.out.println("Password length must be at least 6 characters.");
                System.out.print("Enter the number of characters for the password: ");
                pwLength = in.nextInt();
            }

            password = generatePassword(pwLength);

            outFile.println(password);

            System.out.print("Do you want to generate another password? (Y/N): ");
            userChoice = in.next();
        }

        outFile.close();

        Scanner fileScanner = new Scanner(new File("passwords.txt"));
        System.out.println("\nGenerated Passwords:");
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }

    private static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar;
            int choice = (int) (Math.random() * 3); // 0 for lowercase, 1 for uppercase, 2 for digit

            switch (choice) {
                case 0:
                    randomChar = (char) ((int) (Math.random() * 26) + 'a');
                    break;
                case 1:
                    randomChar = (char) ((int) (Math.random() * 26) + 'A');
                    break;
                case 2:
                    randomChar = (char) ((int) (Math.random() * 10) + '0');
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

            password.append(randomChar);
        }

        return password.toString();
    }
}
