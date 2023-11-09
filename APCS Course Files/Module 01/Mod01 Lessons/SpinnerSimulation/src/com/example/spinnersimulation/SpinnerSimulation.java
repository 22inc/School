package com.example.spinnersimulation;

import java.util.Random;
import java.util.Scanner;

public class SpinnerSimulation {
    public static void main(String[] args) {
        int totalSpins = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("How many times will the spinner spin? ");
        totalSpins = in.nextInt();

        String[] colors = {"Blue", "Red", "Yellow", "Green"};

        Random random = new Random();

        for (int i = 1; i <= totalSpins; i++) {
            int randomIndex = random.nextInt(colors.length);
            String resultColor = colors[randomIndex];
            System.out.println("Spin " + i + ": " + resultColor);
        }
    }
}