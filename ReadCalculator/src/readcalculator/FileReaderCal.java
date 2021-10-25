package readcalculator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class FileReaderCal {

	public static HashMap<String, String> readFile() {
		HashMap<String, String> hm = new HashMap<>();
		String fname = "";
		String fcontent = "";
		File dir = new File("D:/New folder (2)");
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				try {
					fname = file.getName();
					fcontent = Files.readString(Paths.get(file.toURI()));
				} catch (IOException e) {
					System.out.println("File not Found");
				}
				hm.put(fname, fcontent);
			}
		}
		return hm;
	}
}
