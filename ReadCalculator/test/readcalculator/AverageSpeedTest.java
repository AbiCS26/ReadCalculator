package readcalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AverageSpeedTest {
	AverageSpeed a = new AverageSpeed();

	@Test
	void testAverageSpeedFor350() {
		assertEquals("1.75 mins", a.printAverage(350, 2));
	}

	@Test
	void testAverageSpeedBelow10() {
		assertEquals("0.02 mins", a.printAverage(8, 3));
	}

	@Test
	void testAverageSpeedfor200() {
		assertEquals("2.00 mins", a.printAverage(200, 1));
	}

	@Test
	void testAverageSpeedfor0() {
		assertEquals("0.00 mins", a.printAverage(0, 1));
	}

	@Test
	void testAverageSpeedforNegativeValues() {
		assertThrows(NegativeCountException.class, () -> a.printAverage(-80, 2));
	}
}
