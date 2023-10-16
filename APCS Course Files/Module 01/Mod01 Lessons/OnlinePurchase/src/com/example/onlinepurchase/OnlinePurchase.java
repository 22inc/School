package com.example.onlinepurchase;

import java.util.Scanner;

/**
 * This program generates an eReceipt for an online purchase.
 * It prompts the user for shopper's information and item details,
 * then calculates the total cost of the purchase and displays a receipt.
 * 
 * @author Malik Hassan
 * @version 10/16/2023
 */

public class OnlinePurchase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for shopper's information
        System.out.print("Enter shopper's first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter shopper's last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = scanner.nextLine();

        // Prompt the user for item details
        System.out.print("Enter the name of the item: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter the quantity of the item: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the price of the item: $");
        double price = Double.parseDouble(scanner.nextLine());

        // Prompt the user for debit card information
        System.out.print("Enter debit card account number: ");
        String cardNumber = scanner.nextLine();

        System.out.print("Enter debit card PIN: ");
        String pin = scanner.nextLine();

        // Calculate the total cost
        double totalCost = quantity * price;

        // Close the scanner
        scanner.close();

        // Generate the eReceipt
        System.out.println("\n------- eReceipt -------");
        System.out.println("Shopper's Name: " + firstName.charAt(0) + ". " + lastName);
        System.out.println("Order Number: " + lastName + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Date: " + date);
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: $" + price);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Card Ending: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("\nThank you for your purchase!");
    }
}
