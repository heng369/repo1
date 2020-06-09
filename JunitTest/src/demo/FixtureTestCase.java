package demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import demo.Calculator;

/**
 * �̼�����
 * @version
 */
public class FixtureTestCase {
	
	private static Calculator cal = new Calculator();
	
	/**
	 * ����������ʼ��ʱ��ִ�з���
	 */
	@BeforeClass
	public static void setUpClass() {
		System.out.println("ִ��setUpClass����!");
	}
	
	/**
	 * ���в��Է���ִ����Ϻ�ִ�з���
	 */
	@AfterClass
	public static void tearDownClass() {
		System.out.println("ִ��tearDownClass����!");
	}

	/**
	 * ÿ������ִ��ǰ
	 */
	@Before
	public void setUp() {
		System.out.println("ִ��setUp����!");
		cal.clear();
	}
	
	/**
	 * ÿ������ִ�к�
	 */
	@After
	public void tearDown() {
		System.out.println("ִ��tearDown����!");
		//cal.clear();
	}
	
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
		//cal.clear();
		cal.add(10);
		cal.substract(2);
		assertEquals(8, cal.getResult());
	}
}