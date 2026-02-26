package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecommendWordWrong {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
        if(!checker.checkWord("bank")) {
            checker.addWord("bank");
        }
		String result = checker.recommend("bamk");
		assertEquals("bank", result);
	}

}