package com.largefilereadingefficiency;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethod {
	public static long computeAndMeasure(String filePath) {
		// Records the start time before reading the file
		long startTime = System.nanoTime();

		// Calls the method to read the file using FileReader
		readFile(filePath);

		// Records the end time after reading the file
		long endTime = System.nanoTime();

		// Calculates and returns the total execution time in milliseconds
		return (endTime - startTime) / 1000000;
	}

	public static void readFile(String filePath) {
		// Defines a FileReader object to read characters from a file
		FileReader reader = null;

		try {
			// Initializes the FileReader with the given file path
			reader = new FileReader(filePath);

			// Reads characters one by one from the file
			while (reader.read() != -1) {
				// Continues reading until the end of the file
			}
		} catch (IOException e) {
			// Handles exceptions if the file is not found or cannot be read
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			// Ensures the FileReader is closed to prevent resource leaks
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing FileReader: " + e.getMessage());
			}
		}
	}
}
