package prj1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calcException {

	@Test // ��������� �����
	(expected = ArithmeticException.class) //��������� ��������� Exception ��� ������� �� ����
	public void testMaxV() {
		double result = Program.maxV(50, 150, 250, 0.5, 0, 800, 1400, 750); //�������� ���������
	}

}
