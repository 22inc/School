package com.example.tdee;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

/**
 * This program calculates your daily calorie expenditure.
 */

public class TDEE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your gender (Male/Female): ");
        String gender = scanner.nextLine();
        
        System.out.print("Enter your BMR: ");
        double bmr = scanner.nextDouble();
        
        System.out.println("Choose your activity level:");
        System.out.println("1. Resting (Sleeping, reclining)");
        System.out.println("2. Sedentary (Minimal movement, mainly sitting/lying down)");
        System.out.println("3. Light (Office work, light activities)");
        System.out.println("4. Moderate (Light manual labor)");
        System.out.println("5. Very Active (Hard manual labor)");
        System.out.println("6. Extremely Active (Heavy manual labor)");
        
        int choice;
        double activityFactor = 0.0;
        do {
            System.out.print("Enter the number corresponding to your activity level: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    activityFactor = 1.0;
                    break;
                case 2:
                    activityFactor = gender.equalsIgnoreCase("Male") ? 1.3 : 1.3;
                    break;
                case 3:
                    activityFactor = gender.equalsIgnoreCase("Male") ? 1.6 : 1.5;
                    break;
                case 4:
                    activityFactor = gender.equalsIgnoreCase("Male") ? 1.7 : 1.6;
                    break;
                case 5:
                    activityFactor = gender.equalsIgnoreCase("Male") ? 2.1 : 1.9;
                    break;
                case 6:
                    activityFactor = gender.equalsIgnoreCase("Male") ? 2.4 : 2.2;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid number.");
            }
        } while (choice < 1 || choice > 6);

        double tdee = bmr * activityFactor;

        System.out.println("\nResults for " + name + ":");
        System.out.println("Gender: " + gender);
        System.out.println("BMR: " + bmr);
        System.out.println("Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + tdee + " calories/day");

        scanner.close();
    }
}
