package prj1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calcException {

	@Test (expected = ArithmeticException.class)
	public void testMaxV() {
		double result = Program.maxV(0, 0, 0, 0, 0, 0, 0, 0 );
	}

}
