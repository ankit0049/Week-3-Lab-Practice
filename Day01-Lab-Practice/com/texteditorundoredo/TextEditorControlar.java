package com.texteditorundoredo;

public class TextEditorControlar {
	public static void main(String[] args) {
		// Limit history to 3 states
		TextEditor editor = new TextEditor(3);

		// Add states to the history
		editor.addState("Ankit");
		editor.addState("Rajput, ");
		editor.addState("Welcome!");
		editor.addState("To the Programmer");
		editor.addState("world!");
		editor.addState("Hello, world! How are you?");

		// Display the current state
		editor.displayCurrentState();

		// Perform undo operations
		System.out.println("\nresult after undo operation");
		editor.undo();
		editor.displayCurrentState();
		System.out.println("\nresult after undo operation");
		editor.undo();
		editor.displayCurrentState();

		// Perform redo operations
		System.out.println("\nresult after redo operation");
		editor.redo();
		editor.displayCurrentState();

		System.out.println("\nresult after redo operation");
		editor.redo();
		editor.displayCurrentState();
	}
}
