package pruebasunitarias;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	
	private final Calculator  calculator = new Calculator();
	
	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}
 void subtraction() {
	 assertEquals(5, calculator.addNumbers(8, 3));
 }
	
		
	}