package readcalculator;

import java.util.HashMap;

import inputs.Inputs;

public class ReadCalMain {

	public static void main(String args[]) {
		HashMap<String, String> hm = FileReaderCal.readFile();
		String n = "";
		int count = 0;
		do {
			n = Inputs.getFileNoFromUser();
			try {
				count = WordCount.countWord(hm.get(n));
				int category = Inputs.getCategoryFromUser();
				System.out.println(AverageSpeed.printAverage(count, category));
			} catch (NullPointerException e) {
				System.out.println("ENTER CORRECT NAME!");
			} catch (MisSelectionException e) {
			}

		} while (Inputs.userNotDone(n));
	}
}
