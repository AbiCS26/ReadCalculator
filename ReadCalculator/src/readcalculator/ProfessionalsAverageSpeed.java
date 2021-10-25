package readcalculator;

public class ProfessionalsAverageSpeed extends AverageSpeedGenerator implements AverageSpeedInterface {
	public String getAverage(int count) {
		int avg = 350;
		return generateAverageSpeed(avg, count);
	}
}
