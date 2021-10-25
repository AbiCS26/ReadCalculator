package readcalculator;

public class AverageSpeed {

	public static String printAverage(int count, int category) {
		AverageFactory AF = new AverageFactory();
		AverageSpeedInterface avgSpeed = AF.getObjectForCategory(category);
		return avgSpeed.getAverage(count);
	}
}
