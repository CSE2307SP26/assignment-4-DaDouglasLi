package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcceptBadWordTest {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
        if(!checker.checkWord("hello")) {
            checker.addWord("hello");
        }
        boolean result = checker.checkWord("ciallo");
		assertEquals(false, result);
	}

}
