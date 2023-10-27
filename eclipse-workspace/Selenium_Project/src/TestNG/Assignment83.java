
//If there are 2 @test then what will be the order of execution? as per alphabetical order.

package TestNG;

import org.testng.annotations.Test;

public class Assignment83 
{

	@Test
	public void testcase1()
	{
		System.out.println("Test1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Test2");
	}
}
