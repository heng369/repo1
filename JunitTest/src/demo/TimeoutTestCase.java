package demo;

import org.junit.Assert;
import org.junit.Test;
import demo.Calculator;

/**
 * ��ʱ����
 * @version
 */
public class TimeoutTestCase {

	private Calculator cal = new Calculator();
	
	/**
	 * ������ƽ����
	 */
	@Test(timeout=1000)
	public void testSquareRoot() {
		cal.squareRoot(4);
		Assert.assertEquals(2, cal.getResult());
	}
}

