package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpellCheckerTest {

	@Test
	void test() {
		// fail("Not yet implemented");
		//consrtuct a spell checker
		SpellChecker checker = new SpellChecker();
		//call the spell checker to check a word
		int words = checker.getNumberOfWords();
		//use assert to check the result
		assertEquals(0, words);
	}

}
