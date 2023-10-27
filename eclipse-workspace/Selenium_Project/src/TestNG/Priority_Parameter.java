package TestNG;

import org.testng.annotations.Test;

public class Priority_Parameter 
{
	@Test(priority=1)
	public void testcase1()
	{
		System.out.println("testcase 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("testcase 2");
	}
}
