package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.security.SecureRandom;
import org.junit.jupiter.api.Test;

class AddWordDontKnowTest {

	@Test
	void test() {
		SpellChecker checker = new SpellChecker();
		int before = checker.getNumberOfWords();
        String randomWord = generateRandomString((int)(Math.random() * 100));
        while(checker.checkWord(randomWord)) {
            randomWord = generateRandomString((int)(Math.random() * 100));
        }
        checker.addWord(randomWord);
        int after = checker.getNumberOfWords();
        assertEquals(before + 1, after);
	}

    public static String generateRandomString(int length) {
        // generate a random alphanumeric string of the specified length
        final String ALPHANUMERIC_POOL = "abcdefghijklmnopqrstuvwxyz";
        Random random = new SecureRandom(); 
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(ALPHANUMERIC_POOL.length());
            builder.append(ALPHANUMERIC_POOL.charAt(randomIndex));
        }
        return builder.toString();
    }

}

