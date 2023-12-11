package com.example.testing;

public class Testing {
    public static void main(String[] args) {
    	String str = "Hello world!";
    	int nonSpaceCount = countNonSpaceCharacters(str);
    	System.out.println("Number of non-space characters: " + nonSpaceCount);
    }
    
    public static int countNonSpaceCharacters(String str) {
    	  int count = 0;
    	  for (char c : str.toCharArray()) {
    	    if (!Character.isWhitespace(c)) {
    	      count++;
    	    }
    	  }
    	  return count;
    }
}