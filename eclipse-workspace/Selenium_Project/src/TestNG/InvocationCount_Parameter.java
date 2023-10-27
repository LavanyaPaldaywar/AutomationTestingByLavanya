package TestNG;

import org.testng.annotations.Test;

public class InvocationCount_Parameter 
{
	@Test(invocationCount=5)
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
