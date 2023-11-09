package com.example.jdal;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * Sifts through text files to categorize families.
 *
 * @author Malik Hassan
 * @version 11/09/2023
 */

public class Family {
    public static void main(String[] args) {
        int totalFamilies = 0;
        int twoBoysFamilies = 0;
        int twoGirlsFamilies = 0;
        int boyAndGirlFamilies = 0;

        try {
            File file = new File("familyMembers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                totalFamilies++;
                String combination = scanner.next();

                if (combination.equals("BB")) {
                    twoBoysFamilies++;
                } else if (combination.equals("GG")) {
                    twoGirlsFamilies++;
                } else {
                    boyAndGirlFamilies++;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: familyMembers.txt");
            return;
        }

        double percentageTwoBoys = (double) twoBoysFamilies / totalFamilies * 100;
        double percentageTwoGirls = (double) twoGirlsFamilies / totalFamilies * 100;
        double percentageBoyAndGirl = (double) boyAndGirlFamilies / totalFamilies * 100;

        System.out.println("Composition statistics for families with two children.");
        System.out.println("");
        System.out.println("Total number of families: " + totalFamilies);
        System.out.println("");
        System.out.println("Number of families with");
        System.out.println("		2 Boys: " + String.format("%.2f", percentageTwoBoys) + "%");
        System.out.println("		2 Girls: " + String.format("%.2f", percentageTwoGirls) + "%");
        System.out.println("		1 Boy and 1 Girl: " + String.format("%.2f", percentageBoyAndGirl) + "%");
    }
}
