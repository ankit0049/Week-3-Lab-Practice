package com.largefilereadingefficiency;

import java.io.File;
import java.io.IOException;

public class FileReadComparison {
	public static void main(String[] args) {
		// Defines the file path to be read
		for (int i = 1; i < 4; i++) {
			String filePath = "example"+i+".txt";

			// Measures and prints execution time for FileReader method
			System.out.println("FileReader Time: " + FileReaderMethod.computeAndMeasure(filePath) + " ms");

			// Measures and prints execution time for InputStreamReader method
			System.out.println("InputStreamReader Time: " + InputStreamReaderMethod.computeAndMeasure(filePath) + " ms\n");

		}
	}
}
