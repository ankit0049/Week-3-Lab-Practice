package com.stringbuilder.reverseusingstringbuilder;

// Class to reverse a string using StringBuilder
class StringReverser {

    // Method to reverse a string using StringBuilder
    public static String reverseString(String input) {
	   // Creating a StringBuilder object with the input string
	   StringBuilder sb = new StringBuilder(input);

	   // Using the reverse() method to reverse the string
	   sb.reverse();

	   // Converting the StringBuilder back to a string and returning the result
	   return sb.toString();
    }

    public static void main(String[] args) {
	   // Given input string
	   String input = "tupjaR tiknA";

	   // Reversing the string using StringBuilder and printing the result( Expected : Ankit Rajput)
	   System.out.println("Reversed string: " + StringReverser.reverseString(input));
    }
}
