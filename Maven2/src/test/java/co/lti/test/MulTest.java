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
	public void testmul()
	{
		assertEquals(24, arth.mul(4, 6));
	}
	
	@Test
	public void testmax()
	{
		assertEquals(6, arth.max(4, 6));
	}

}
