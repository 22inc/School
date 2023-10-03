package com.example.currencyv2;

/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Malik Hassan
 * @version 10/03/23
 */

public class CurrencyV2 {
    public static void main(String[] args) {
        double startingUsDollars = 6500.00;
        double totalBudget = startingUsDollars;

        double pesoExchangeRate = 17.89;
        double euroExchangeRate = 0.96;
        double yenExchangeRate = 149;

        double pesosSpent = 7250;
        double eurosSpent = 450.0;
        double yenSpent = 22000.0;

        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        double dollarsSpentInEurope = eurosSpent / euroExchangeRate;
        double dollarsSpentInJapan = yenSpent / yenExchangeRate;

        totalBudget -= dollarsSpentInMexico + dollarsSpentInEurope + dollarsSpentInJapan;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Spending in Mexico: $" + dollarsSpentInMexico);
        System.out.println("Remaining budget after Mexico: $" + totalBudget);

        System.out.println("Spending in Europe: $" + dollarsSpentInEurope);
        System.out.println("Remaining budget after Europe: $" + totalBudget);

        System.out.println("Spending in Japan: $" + dollarsSpentInJapan);
        System.out.println("Remaining budget after Japan: $" + totalBudget);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println("(all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        double costItem1 = 15.99;
        double budget1 = totalBudget;
        int totalItems1 = (int) (budget1 / costItem1);
        double fundsRemaining1 = budget1 % costItem1;

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1);
        System.out.println("   Budget: $" + budget1);
        System.out.println("   Total items purchased: " + totalItems1);
        System.out.println("   Funds remaining: $" + fundsRemaining1);
        System.out.println();

        double costItem2 = 29.99;
        double budget2 = totalBudget;
        int totalItems2 = (int) (budget2 / costItem2);
        double fundsRemaining2 = budget2 % costItem2;

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2);
        System.out.println("   Budget: $" + budget2);
        System.out.println("   Total items purchased: " + totalItems2);
        System.out.println("   Funds remaining: $" + fundsRemaining2);
    }
}