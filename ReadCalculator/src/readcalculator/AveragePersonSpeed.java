package readcalculator;

public class AveragePersonSpeed extends AverageSpeedGenerator implements AverageSpeedInterface {
	public String getAverage(int count) {
		int avg = 200;
		return generateAverageSpeed(avg, count);
	}
}
