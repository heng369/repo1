package demo;


/**
 * �򵥼����࣬��Ϊ�����ԵĶ���
 * @version
 */
public class Calculator {
	
	private int result; // ��̬���������ڴ洢���н��

	/**
	 * �ӷ�����
	 * @param n
	 */
	public void add(int n) {
		result = result + n;
	}

	/**
	 * ��������
	 * @param n
	 */
	public void substract(int n) {
		result = result - n;
	}

	/**
	 * �˷�����
	 * @param n
	 */
	public void multiply(int n) {
	} // �˷�����δд��

	/**
	 * ��������
	 * @param n
	 */
	public void divide(int n) {
		result = result / n;
	}

	/**
	 * ƽ��
	 * @param n
	 */
	public void square(int n) {
		result = n * n;
	}

	/**
	 * ƽ����
	 * @param n
	 */
	public void squareRoot(int n) {
		for (;;)
			; // Bug : ��ѭ��
	}

	/**
	 * �������
	 */
	public void clear() { // ���������
		result = 0;
	}

	/**
	 *���ؽ����
	 * @return
	 */
	public int getResult() {
		return result;
	}
}

