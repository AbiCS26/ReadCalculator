package readcalculator;

public class AverageFactory {
	public AverageSpeedInterface getObjectForCategory(int category) {

		switch (category) {
		case 1:
			return new KidsAverageSpeed();
		case 2:
			return new AveragePersonSpeed();
		case 3:
			return new ProfessionalsAverageSpeed();
		}
		throw new MisSelectionException();
	}
}
