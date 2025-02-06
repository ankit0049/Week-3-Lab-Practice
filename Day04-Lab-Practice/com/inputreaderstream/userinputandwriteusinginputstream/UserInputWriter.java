package com.inputreaderstream.userinputandwriteusinginputstream;

import java.io.*;

// Class to read user input and write it to a file using InputStreamReader
class UserInputWriter {

    // Method to read user input and write to a file
    public static void writeUserInputToFile(String filePath) throws IOException {
        // Creating an InputStreamReader to read input from console
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        
        // Wrapping InputStreamReader in BufferedReader for efficient reading
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        // Creating a FileWriter object to write input to a file
        FileWriter fileWriter = new FileWriter(filePath);
        
        // Variable to store user input
        String userInput;
        
        System.out.println("Enter text (type 'exit' to stop):");

        // Reading user input until "exit" is entered
        while (!(userInput = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
            // Writing user input to file with a new line
            fileWriter.write(userInput + "\n");
        }
        
        // Closing the FileWriter to save changes
        fileWriter.close();
        
        // Closing the BufferedReader to release resources
        bufferedReader.close();
        
        System.out.println("User input successfully written to file.");
    }

    public static void main(String[] args) {
        // Specifying the file path
        String filePath = "C:/Users/Ankit Rajput/IdeaProjects/Week-3-Day-4/src/com/userinputandwriteusinginputstream/example.txt";
        try {
            // Writing user input to the specified file
            UserInputWriter.writeUserInputToFile(filePath);
        } catch (IOException e) {
            // Handling exceptions if file writing fails
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
