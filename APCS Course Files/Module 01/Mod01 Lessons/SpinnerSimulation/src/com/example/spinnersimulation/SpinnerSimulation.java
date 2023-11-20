package com.example.spinnersimulation;

import java.util.Random;

public class SpinnerSimulation {
    public static void main(String[] args) {
        int totalSpins = 15;


        String[] colors = {"Blue", "Red", "Yellow", "Green"};

        Random random = new Random();

        for (int i = 1; i <= totalSpins; i++) {
            int randomIndex = random.nextInt(colors.length);
            String resultColor = colors[randomIndex];
            System.out.println("Spin " + i + ": " + resultColor);
        }
    }
}