package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddWordKnowTest {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
        int before = checker.getNumberOfWords();
        checker.addWord(checker.getRandomWord());
        int after = checker.getNumberOfWords();
        assertEquals(before, after);
	}

}