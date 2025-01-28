package com.texteditorundoredo;

class TextStateNode {
	// Represents a single state of the text
	String text;

	// Creates pointer to manage the state named as prev and next
	TextStateNode prev;
	TextStateNode next;

	// Create a constructor to intilize the instance variable
	public TextStateNode(String text) {
		this.text = text;
		this.prev = null;
		this.next = null;
	}
}
