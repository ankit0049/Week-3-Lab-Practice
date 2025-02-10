package com.largefilereadingefficiency;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderMethod {
	public static long computeAndMeasure(String filePath) {
		// Records the start time before reading the file
		long startTime = System.nanoTime();

		// Calls the method to read the file using InputStreamReader
		readFile(filePath);

		// Records the end time after reading the file
		long endTime = System.nanoTime();

		// Calculates and returns the total execution time in milliseconds
		return (endTime - startTime) / 1000000;
	}

	public static void readFile(String filePath) {
		// Defines an InputStreamReader object to read bytes and convert them to characters
		InputStreamReader reader = null;

		try {
			// Initializes the InputStreamReader with a FileInputStream for byte-based reading
			reader = new InputStreamReader(new FileInputStream(filePath));

			// Reads characters one by one from the file
			while (reader.read() != -1) {
				// Continues reading until the end of the file
			}
		} catch (IOException e) {
			// Handles exceptions if the file is not found or cannot be read
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			// Ensures the InputStreamReader is closed to prevent resource leaks
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing InputStreamReader: " + e.getMessage());
			}
		}
	}
}
