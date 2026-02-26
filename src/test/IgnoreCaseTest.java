package test;

import com.sun.jdi.connect.Connector;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IgnoreCaseTest {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
        if(!checker.checkWord("hello")) {
            checker.addWord("hello");
        }
		boolean result = checker.checkWord("hello");
        boolean result2 = checker.checkWord("HEllO");
		assertEquals(result, result2);
	}

}