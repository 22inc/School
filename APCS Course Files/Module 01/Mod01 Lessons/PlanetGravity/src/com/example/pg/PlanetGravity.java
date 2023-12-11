package com.example.pg;

/**
 * This program calculates and displays the surface gravity of a selected planet
 * based on its mass and diameter.
 *
 * @author Malik Hassan
 * @version 12/11/23
 */

public class PlanetGravity {
    public static void main(String[] args) {
        String planetName = "Mercury";
        double diameter = 4880;
        double mass = 3.30e23;

        double surfaceGravity = calculateSurfaceGravity(mass, diameter);

        displayHeader();

        displayPlanetData(planetName, diameter, mass, surfaceGravity);
    }

    public static double calculateSurfaceGravity(double mass, double diameter) {
        double gravitationalConstant = 6.674e-11; // Universal Gravitational Constant
        double radius = diameter * 0.5 * 1000; // Convert diameter from km to meters

        double surfaceGravity = gravitationalConstant * mass / Math.pow(radius, 2);

        return surfaceGravity;
    }

    public static void displayHeader() {
        System.out.println("Planet Surface Gravity Calculator");
        System.out.println("--------------------------------");
    }

    public static void displayPlanetData(String planetName, double diameter, double mass, double surfaceGravity) {
        System.out.println("Planet: " + planetName);
        System.out.println("Diameter: " + diameter + " km");
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Surface Gravity: " + surfaceGravity + " m/s^2");
    }
}

