package com.example.calculationsv6;


/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ author Malik Hassan
 * @ version 09/22/2023 (6)
 *
 * All variable prefixes have a meaning:
 * 		a : addition
 * 		s : subtraction
 * 		m : multiplication
 * 		d : division
 * 		mo : modulus
 * 
 * Doubles are not defined as that is not something that I think needs to be said.
 * 
 * V6 Is actually V3, I did this pre-emptively and then it just happened to be the assignment. Sorry if there is any confusion when checking the versions.
 *
 * Additional equasions are marked with "// Self added", just look for that.
 */


public class CalculationsV6
{
    public static void main(String[ ] args)
    {
    	int aNum1 = 25;
    	int aNum2 = 9;
    	
    	double aNum3 = 43.21;
    	double aNum4 = 3.14;

    	int aNum6 = 98;
    	int aNum7 = 36;
    	
    	// Addition
    	System.out.println("Addition");
    	System.out.println(aNum1 + " + " + aNum2 + " = " +  (aNum1 + aNum2));
    	System.out.println(aNum3 + " + " + aNum4 + " = " +  (aNum3 + aNum4));
    	System.out.println(aNum6 + " + " + aNum7 + " = " +  (aNum6 + aNum7)); // Self added
        System.out.println();
        
    	int sNum1 = 11;
    	int sNum2 = 9;
    	int sNum3 = 25;
    	
    	double sNum4 = 3.14;
    	double sNum5 = 10.0;
    	
    	int sNum6 = 8;
    	int sNum7 = 12;
    	
        // Subtraction
        System.out.println("Subtraction");
    	System.out.println(sNum1 + " - " + sNum2 + " - " + sNum3 + " = " + (sNum1 - sNum2 - sNum3));
    	System.out.println(sNum4 + " - " + sNum5 + " = " +  (sNum4 - sNum5));
    	System.out.println(sNum6 + " - " + sNum7 + " = " +  (sNum6 - sNum7)); // Self added
        System.out.println();

    	int mNum1 = 25;
    	int mNum2 = 9;
    	
    	double mNum3 = 3.14;
    	double mNum4 = 10.0;
    	double mNum5 = 10.0;
    	
    	int mNum6 = 12;
    	int mNum7 = 82;
    	
        // Multiplication
        System.out.println("Multiplication");
    	System.out.println(mNum1 + " * " + mNum2 + " = " + (mNum1 * mNum2));
    	System.out.println(mNum3 + " * " + mNum4 + " * " + mNum5 + " = " + (mNum3 * mNum4 * mNum5));
    	System.out.println(mNum6 + " * " + mNum7 + " = " +  (mNum6 * mNum7)); // Self added
        System.out.println();

    	int dNum1 = 9;
    	int dNum2 = 25;
    	
    	double dNum3 = 43.21;
    	double dNum4 = 10.0;

        // Division
        System.out.println("Division");
    	System.out.println(dNum1 + " / " + dNum2 + " = " +  (dNum1 / dNum2));
    	System.out.println(dNum3 + " / " + dNum4 + " = " +  (dNum3 / dNum4));
        System.out.println();
        
    	int moNum1 = 11;
    	int moNum2 = 9;
    	
    	double moNum3 = 10.0;
    	double moNum4 = 3.14;

        // Modulus operator
        System.out.println("Modulus");
    	System.out.println(moNum1 + " % " + moNum2 + " = " +  (moNum1 % moNum2));
    	System.out.println(moNum3 + " % " + moNum4 + " = " +  (moNum3 % moNum4));
        System.out.println();

        
        // 1.08 Additional int Equations
        
        
        // 1.09 Additional double Equations
        
               
    } // end of main method
} // end of class