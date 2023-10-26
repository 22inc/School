package com.example.bmi;

/*
* The purpose of this program is to calculate your place within the BMI.
*
* @author Malik Hassan
* @version 10/25/2023
*/


import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your height (in feet and inches, e.g., 5 10 for 5 feet 10 inches): ");
        int heightFeet = scanner.nextInt();
        int heightInches = scanner.nextInt();
        System.out.print("Enter your weight (in pounds): ");
        double weightPounds = scanner.nextDouble();

        double poundsToKilograms = 0.453592;
        double inchesToMeters = 0.0254;

        double heightMeters = ((heightFeet * 12) + heightInches) * inchesToMeters;

        double weightKilograms = weightPounds * poundsToKilograms;

        double bmi = weightKilograms / (heightMeters * heightMeters);

        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi < 25) {
            weightStatus = "Normal or Healthy Weight";
        } else if (bmi < 30) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        System.out.println("\nHello, " + firstName + " " + lastName + "!");
        System.out.println("Your BMI is " + String.format("%.2f", bmi));
        System.out.println("Your weight status is: " + weightStatus);
    }
}
