package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unitTest.Math;

class MathTest {
	
	Math math = new Math();

	@Test
	void testMultiplyReturns10CorrectValues() {
		int product = math.multiply(2, 5);
		assertEquals(10, product);
	}
	
//	@Test
//	void testDivideReturnsCorrectValues() {
//		double result = math.divide(5.0, 2.0);
//		assertEquals(2.5, result);
//		
//	}
	
	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(math.isPositiveNumber(a));
	}
	
	@Test
	void testDivideThrowsExceptionWhenDividingBy0() {
		assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
	}

}
