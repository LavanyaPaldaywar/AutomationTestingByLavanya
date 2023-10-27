
//There is a class in which we have 3 @Test and only 1AM, what will be the order of execution?
package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment86 
{
	@Test
	public void add()
	{
		System.out.println("Test Add");
	}
	@Test
	public void subtract()
	{
		System.out.println("Test Subtract");
	}
	@Test
	public void multiply()
	{
		System.out.println("Test Multiply");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}
}
