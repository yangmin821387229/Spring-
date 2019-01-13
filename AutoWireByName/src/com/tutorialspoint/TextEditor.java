package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
