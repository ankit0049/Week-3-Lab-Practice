package com.stringbuffer.stringbuffervsstringbuilder;

// Class to compare performance of StringBuffer and StringBuilder for concatenation
class PerformanceComparator {

    // Method to measure time taken by StringBuffer for concatenation
    public static long measureStringBufferTime(int iterations) {
	   // Creating a StringBuffer object
	   StringBuffer stringbuffer = new StringBuffer();

	   // Recording start time
	   long startTime = System.nanoTime();

	   // Performing concatenation for given number of iterations
	   for (int i = 0; i < iterations; i++) {
		  stringbuffer.append("Ankit Rajput");
	   }

	   // Recording end time and returning elapsed time
	   return System.nanoTime() - startTime;
    }

    // Method to measure time taken by StringBuilder for concatenation
    public static long measureStringBuilderTime(int iterations) {
	   // Creating a StringBuilder object
	   StringBuilder stringbuffer = new StringBuilder();

	   // Recording start time
	   long startTime = System.nanoTime();

	   // Performing concatenation for given number of iterations
	   for (int i = 0; i < iterations; i++) {
		  stringbuffer.append("Ankit Rajput");
	   }

	   // Recording end time and returning elapsed time
	   return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
	   // Defining number of iterations for testing
	   int iterations = 1000000;

	   // Measuring time taken by StringBuffer
	   long bufferTime = PerformanceComparator.measureStringBufferTime(iterations);

	   // Measuring time taken by StringBuilder
	   long builderTime = PerformanceComparator.measureStringBuilderTime(iterations);

	   // Printing the time taken by both approaches
	   System.out.println("Time taken by StringBuffer: " + bufferTime + " nanoseconds");
	   System.out.println("Time taken by StringBuilder: " + builderTime + " nanoseconds");
    }
}
