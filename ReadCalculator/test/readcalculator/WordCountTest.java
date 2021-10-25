package readcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class WordCountTest {
	WordCount w = new WordCount();

	@Test
	void testForWordCount() {
		assertEquals(15, w
				.countWord("Write a module that tokenize's, the text so that each word, can be counted individually."));
	}

	@Test
	void testForEmpty() {
		assertEquals(0, w.countWord(""));
	}

	@Test
	void testForExtraSpaces() {
		assertEquals(5, w.countWord("Write    a module     that     tokenizes"));
	}

	@Test
	void testForNumbers() {
		assertEquals(7, w.countWord("544    525   689   6665  475 747 888"));
	}

	@Test
	void testForLineBreaks() {
		assertEquals(10, w.countWord("the text so\t that each\n\n word,\n can be counted individually"));
	}

}
