package com.example.makingmethodcalls;

/**
 * Makes multiple method calls, used to show how methods work.
 *  
 * @ author Malik Hassan
 * @ version 10/13/2023
 * 
 */

public class MakingMethodCalls {
    public static void addTheseTwo() {
        System.out.println("Ten plus five equals " + (10 + 5));
    }   
    
    public static void multiplyTheseTwo(int a, int b) {
        System.out.println("Ten times five equals " + (a * b));
    }  
    
    public static int divideTheseTwo(int a, int b) {
        return (a / b);
    }    
    
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        addTheseTwo();

        multiplyTheseTwo(x, y);
        
        int result = divideTheseTwo(x, y);
        System.out.println("Ten divided by five equals " + result);
    
    }//end of main method
}//end of class