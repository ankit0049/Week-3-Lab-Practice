package com.stringbuffer.concateusingstrigbuffer;

// Class to concatenate strings using StringBuffer
class StringConcatenator {

    // Method to concatenate an array of strings using StringBuffer
    public static String concatenateStrings(String[] words) {
	   // Creating a StringBuffer object to store concatenated result
	   StringBuffer sb = new StringBuffer();

	   // Iterating through each string in the array
	   for (String word : words) {
		  // Appending the current word to StringBuffer
		  sb.append(word);
	   }

	   // Returning the final concatenated string
	   return sb.toString();
    }

    public static void main(String[] args) {
	   // Given array of strings
	   String[] words = {"Hello ", "Welcome", "!", " In", " the", " Bridge", " Labz", " X"," CG", " Training", " of", " Java."};

	   // Concatenating strings using StringBuffer and printing the result
	   System.out.println("Concatenated string: " + StringConcatenator.concatenateStrings(words));
    }
}
