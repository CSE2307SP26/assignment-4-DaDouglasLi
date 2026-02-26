package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteDuplicateTest {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
		checker.addWord("hello");
		checker.addWord("hello");
		int words = checker.getNumberOfWords();
		checker.deleteDuplicate();
		int changeWords = checker.getNumberOfWords()-words;
		assertEquals(-1, changeWords);

	}

}
