package co.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Mul;

public class MulTest {
private Mul arth;
	
	@Before
	public void init()
	{
		arth = new Mul();
	}

	@Test
	public void testSum()
	{
		assertEquals(24, arth.mul(4, 6));
	}

}
