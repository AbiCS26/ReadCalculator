package readcalculator;

import java.text.DecimalFormat;

public class AverageSpeedGenerator {

	protected String generateAverageSpeed(int avg, int count) {
		if (count < 0)
			throw new NegativeCountException();

		DecimalFormat d = new DecimalFormat("0.00");
		float res = (float) count / avg;
		return d.format(res) + " mins";
	}
}
