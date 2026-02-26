package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcceptGoodWordTest {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
        if(!checker.checkWord("hello")) {
            checker.addWord("hello");
        }
        boolean result = checker.checkWord("hello");
		assertEquals(true, result);
	}

}