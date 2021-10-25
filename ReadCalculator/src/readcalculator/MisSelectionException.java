package readcalculator;

public class MisSelectionException extends RuntimeException {
	public MisSelectionException() {
		System.out.println("SELECT A CATEGORY BETWEEN 1-3\n");
	}
}
