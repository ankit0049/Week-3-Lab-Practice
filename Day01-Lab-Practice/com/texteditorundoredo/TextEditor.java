package com.texteditorundoredo;

public class TextEditor {
	// Represents the history of text states as a doubly linked list
	private TextStateNode head;
	private TextStateNode tail;
	private TextStateNode current;
	private int maxSize; // Max size for history

	public TextEditor(int maxSize) {
		this.maxSize = maxSize;
		this.head = null;
		this.tail = null;
		this.current = null;
	}

	// Adds a new text state to the end of the history
	public void addState(String text) {
		TextStateNode newNode = new TextStateNode(text);

		if (head == null) { // If the history is empty
			head = newNode;
			tail = newNode;
			current = newNode;
		} else {
			// If we're not at the latest state, remove all forward states (redo is no longer possible)
			if (current.next != null) {
				current.next = null;
				tail = current;
			}

			// Add the new state at the end of the history
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			current = tail;

			// Enforce the history size limit (delete the oldest state if size exceeds maxSize)
			enforceHistoryLimit();
		}
	}

	// Enforces the maximum size for the history
	private void enforceHistoryLimit() {
		int size = getSize();
		while (size > maxSize) {
			// Remove the oldest state (head) if history size exceeds maxSize
			removeOldestState();
			size--; // Decrease the size after removal
		}
	}

	// Removes the oldest state to enforce the max size limit
	private void removeOldestState() {
		if (head != null) {
			head = head.next; // Move the head pointer to the next node
			if (head != null) {
				head.prev = null; // Remove the link from the old head
			}
		}
	}

	// Reverts to the previous text state (undo)
	public void undo() {
		if (current != null && current.prev != null) {
			current = current.prev;
		} else {
			System.out.println("No more undo history.");
		}
	}

	// Reverts to the next text state (redo)
	public void redo() {
		if (current != null && current.next != null) {
			current = current.next;
		} else {
			System.out.println("No more redo history.");
		}
	}

	// Displays the current text content
	public void displayCurrentState() {
		if (current != null) {
			System.out.println("Current Text: " + current.text);
		} else {
			System.out.println("No text available.");
		}
	}

	// Gets the current size of the history
	private int getSize() {
		int size = 0;
		TextStateNode temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
}
