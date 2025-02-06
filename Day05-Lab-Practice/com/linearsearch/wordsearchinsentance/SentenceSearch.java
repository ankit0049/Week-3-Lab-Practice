package com.linearsearch.wordsearchinsentance;

class SentenceSearch {

    // Method to find the first sentence containing a specific word using linear search
    public static String findSentenceWithWord(String[] sentences, String word) {

	   // Iterating through the array of sentences
	   for (String sentence : sentences) {

		  // Checking if the sentence contains the required word
		  if (sentence.contains(word)) {

			 // Returning the first matching sentence
			 return sentence;
		  }
	   }

	   // Returning "Not Found" if the word is not present in any sentence
	   return "Not Found";
    }


    public static void main(String[] args) {

	   // Defining an array of sentences
	   String[] sentences = {"Java is powerful language", "Bridge Labz X Capgemini", "Binary search is efficient then linear Search"};

	   // Defining the target word
	   String word = "search";

	   // Calling the function to find the first sentence containing the word
	   String result = SentenceSearch.findSentenceWithWord(sentences, word);

	   // Printing the result
	   System.out.println(result);
    }
}
