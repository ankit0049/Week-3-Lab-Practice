package com.comparison.comparisionbufferandbuilderandbufferreaderandinputstream;

import java.io.*;

// Main class to execute the comparison tests
public class PerformanceComparisonMain {
    public static void main(String[] args) {
        // Measuring performance of StringBuilder
        long stringBuilderTime = StringPerformanceComparator.measureStringBuilderPerformance();

        // Measuring performance of StringBuffer
        long stringBufferTime = StringPerformanceComparator.measureStringBufferPerformance();

        // Printing the time taken by StringBuilder and StringBuffer
        System.out.println("StringBuilder Time (ns): " + stringBuilderTime);
        System.out.println("StringBuffer Time (ns): " + stringBufferTime);

        // File path for reading (ensure this file exists and is 100MB)
        String filePath = "C:/Users/Ankit Rajput/IdeaProjects/Week-3-Day-4/src/com/comparisionbufferandbuilderandbufferreaderandinputstream/ankitFile.txt";

        try {
            // Measuring performance of FileReader
            long fileReaderTime = FileReaderComparator.countWordsUsingFileReader(filePath);

            // Measuring performance of InputStreamReader
            long inputStreamReaderTime = FileReaderComparator.countWordsUsingInputStreamReader(filePath);

            // Printing the time taken by FileReader and InputStreamReader
            System.out.println("FileReader Time (ns): " + fileReaderTime);
            System.out.println("InputStreamReader Time (ns): " + inputStreamReaderTime);

        } catch (IOException e) {
            // Handling file reading exceptions
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
