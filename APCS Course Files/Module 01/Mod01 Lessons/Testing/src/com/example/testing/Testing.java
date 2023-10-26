package com.example.testing;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	// "Samira".equals("Sami")
    	// "SAMI".compareTo("Samira") < 0
    	// "Sami".compareTo("SAMI") < 0
    	System.out.println("Sami".compareTo("SAMI") < 0);
    }
}