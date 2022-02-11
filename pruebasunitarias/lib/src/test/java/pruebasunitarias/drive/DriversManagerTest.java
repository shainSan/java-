package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DriversManagerTest {
	private DriversManager driversManager = new DriversManager ();

	@Test
	void isaddPassenger() {
		Passenger passenger1 = new Passenger("Carlos", "Abe56");
	driversManager.addPassenger(passenger1);
	assertEquals(passenger1,driversManager.getPassenger("Abe56"));
	}
	
	@Test
	void isaddDriver() {
		Driver driver1 = new Driver ("Carlos", "Abe56", 54);
		driversManager.addDriver(driver1);
		assertEquals(driver1,driversManager.getPassenger("Abe56"));
	}

}
