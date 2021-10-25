package readcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FileReaderCalTest {
	FileReaderCal f = new FileReaderCal();

	@Test
	void testFileNotFound() {
		assertEquals("File not found", f.readFile());
	}

	@Test
	void testForFileContent() {
		assertEquals("abcdefghijkl", f.readFile());
	}

	@Test
	void testForEmptyFile() {
		assertEquals("", f.readFile());
	}

}
