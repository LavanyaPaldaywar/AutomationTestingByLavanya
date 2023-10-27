
//Program for passing invocationCount parameter @Test

package TestNG;

import org.testng.annotations.Test;

public class Assignment93 
{
	@Test
	public void add1()
	{
		System.out.println("add 1");
	}
	
	@Test(invocationCount=3)
	public void add2()
	{
		System.out.println("add 2");
	}
	
	@Test
	public void add3()
	{
		System.out.println("add 3");
	}
}
