package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author warlord
 *
 */
public class TextEditor {
	//	@Autowired
	private SpellChecker spellChecker;

	@Autowired
	public TextEditor(SpellChecker spellChecker) { 
		System.out.println("Inside TextEditor constructor...\n" ); 
		this.spellChecker = spellChecker;
	}

	public void spellCheck() { 
		spellChecker.checkSpelling(); 
	}

	//A getter method to return spellChecker 
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	//@Autowired
	//A setter method to inject the dependency
	//This method will be invoked automatically when constructing a TextEditor object
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

}
