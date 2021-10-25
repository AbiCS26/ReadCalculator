package readcalculator;

import java.util.StringTokenizer;

public class WordCount {

	public static int countWord(String s) {

		StringTokenizer t = new StringTokenizer(s);
		return t.countTokens();
	}
}
