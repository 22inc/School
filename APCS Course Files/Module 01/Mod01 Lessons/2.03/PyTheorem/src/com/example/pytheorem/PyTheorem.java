package com.example.pytheorem;

/**
 * 
 * This program calculates and prints the hypotenuses of two right triangles.
 * It generates random side lengths for each triangle within a specified range and then uses the Pythagorean theorem to calculate and display the lengths of the hypotenuses for both triangles
 *
 * @author Malik Hassan
 * @version 10/05/23
 */

public class PyTheorem {
    public static void main(String[] args) {
        int min = 5;
        int max = 23;

        int sideA1 = (int) (Math.random() * (max - min)) + min;
        int sideB1 = (int) (Math.random() * (max - min)) + min;

        int sideA2 = (int) (Math.random() * (max - min)) + min;
        int sideB2 = (int) (Math.random() * (max - min)) + min;

        double hypotenuse1 = Math.sqrt(Math.pow(sideA1, 2) + Math.pow(sideB1, 2));
        double hypotenuse2 = Math.sqrt(Math.pow(sideA2, 2) + Math.pow(sideB2, 2));

        System.out.println("Triangle 1:");
        System.out.println("Side A1: " + sideA1);
        System.out.println("Side B1: " + sideB1);
        System.out.println("Hypotenuse 1: " + hypotenuse1);
        System.out.println();

        System.out.println("Triangle 2:");
        System.out.println("Side A2: " + sideA2);
        System.out.println("Side B2: " + sideB2);
        System.out.println("Hypotenuse 2: " + hypotenuse2);
    }
}
