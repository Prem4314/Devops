package com.rts.jenkinsdemo;
 
import static org.junit.Assert.assertEquals;
 
import org.junit.Test;
 
public class TestWorkLog {
	
	WorkLog w1 = new WorkLog();
	
	@Test
	public void testAddToLog1()
	{
		assertEquals("Added Log for Remo", w1.addToLog("Remo"));
		
	}
	
	@Test
	public void testAddToLog2()
	{
		assertEquals("Added Log for Lokesh", w1.addToLog("Lokesh"));
 
	}
	
	@Test
	public void testAddToLogin1()
	{
		assertEquals("Added Login log for Remo", w1.addLogins("Remo"));
 
	}
	
	@Test
	public void testAddToLogin2()
	{
		assertEquals("Added Login log for Lokesh", w1.addLogins("Lokesh"));
 
	}
	
}