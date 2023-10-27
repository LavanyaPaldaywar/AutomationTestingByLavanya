//There is a class in which we have 3 @Test, 1BM and 1AM, what will be the order of execution?
package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment85 
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
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}
}
