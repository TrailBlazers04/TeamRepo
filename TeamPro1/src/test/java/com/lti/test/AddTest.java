package com.lti.test;


import static org.junit.Assert.assertEquals;



public class AddTest {
	private Add arth;
	
	@Before
	public void init()
	{
		arth = new Add();
	}

	@Test
	public void testSum()
	{
		assertEquals(10, arth.sum(4, 6));
	}
}