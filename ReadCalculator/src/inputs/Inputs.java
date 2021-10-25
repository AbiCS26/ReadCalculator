package inputs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import readcalculator.FileReaderCal;

public class Inputs {
	private static Scanner sc = new Scanner(System.in);

	public static String getFileNoFromUser() {
		int i = 1;
		HashMap<String, String> hm = FileReaderCal.readFile();

		System.out.println("Enter the File name to estimate reading time:");
		for (Map.Entry<String, String> h : hm.entrySet()) {
			System.out.println(i + ". " + h.getKey());
			i++;
		}
		System.out.println(i + ". " + "Exit");
		sc = new Scanner(System.in);
		String s = sc.next();

		return s;

	}

	public static int getCategoryFromUser() {
		System.out.println(
				"\nSelect a category to estimate reading time:\n1.Kids \n2.Average Person \n3.Professionals \n");
		int no = sc.nextInt();
		return no;
	}

	public static boolean userNotDone(String s) {
		return (s.equalsIgnoreCase("exit")) ? false : true;
	}
}
