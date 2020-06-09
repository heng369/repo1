package demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import demo.Calculator;

/**
 * �򵥲�����
 * @version
 */
public class SimpleTestCase {

	private static Calculator cal = new Calculator();
	
	
	/**
	 * ���Լӷ�����ķ���
	 */
	@Test
	public void testAdd() {
		cal.add(2);
		cal.add(5);
		//��һ������Ԥ��ֵ���ڶ�������ʵ��ֵ����ֵ�Ƚ���Ȳ��Ծ�ͨ��
		assertEquals(7, cal.getResult());
	}
	
	/**
	 * ���Լ�������ķ���
	 */
	@Test
	public void testSubstract() {
		cal.clear();
		cal.add(10);
		cal.substract(2);
		assertEquals(8, cal.getResult());
	}
}