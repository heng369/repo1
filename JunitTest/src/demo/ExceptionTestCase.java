package demo;

import org.junit.Test;

import demo.Calculator;

/**
 * �쳣����
 * @version
 */
public class ExceptionTestCase {

	private static Calculator cal = new Calculator();
	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZore() {
		cal.divide(0);
	}
}

