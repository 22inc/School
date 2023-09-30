/**
 * Calculates total grade percentage.
 *  
 * @ author Malik Hassan
 * @ version 09/29/2023 (1)
 *
 */

package com.example.grades;

public class GradesV2 {
    public static void main(String[] args) {
        int numTests = 0;      // counts number of tests
        int testGrade = 0;     // individual test grade
        int totalPoints = 0;   // total points for all tests
        double average = 0.0;  // average grade

        int[] testScores = {95, 73, 91, 82};

        for (int i = 0; i < testScores.length; i++) {
            testGrade = testScores[i];
            totalPoints += testGrade;
            numTests++;
            average = (double) totalPoints / numTests;

            System.out.println("Test #" + numTests + " Score: " + testGrade);
            System.out.println("Total Points: " + totalPoints);
            System.out.println("Average Grade: " + average);
            System.out.println();
        }
    }
}
