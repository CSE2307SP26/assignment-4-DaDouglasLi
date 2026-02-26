package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpaceTest {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
		boolean result = checker.check(" ");
		assertEquals(false, result);
	}

}
