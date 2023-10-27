
//Program for passing enabled parameter @Test

package TestNG;

import org.testng.annotations.Test;

public class Assignment92 
{

	@Test
	public void add1()
	{
		System.out.println("add 1");
	}
	
	@Test(enabled=false)
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
