package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoDuplicateTest {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
		checker.addWord("hello");
		int words = checker.getNumberOfWords();
		checker.addWord("hello");
		int changeWords = checker.getNumberOfWords()-words;
		assertEquals(0, changeWords);

	}

}
