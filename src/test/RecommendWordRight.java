package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecommendWordRight {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
        if(!checker.checkWord("bank")) {
            checker.addWord("bank");
        }
		String result = checker.recommend("bank");
		assertEquals("bank", result);
	}

}
