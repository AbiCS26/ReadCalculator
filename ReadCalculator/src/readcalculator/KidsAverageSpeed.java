package readcalculator;

public class KidsAverageSpeed extends AverageSpeedGenerator implements AverageSpeedInterface {
	public String getAverage(int count) {
		int avg = 100;
		return generateAverageSpeed(avg, count);
	}

}
