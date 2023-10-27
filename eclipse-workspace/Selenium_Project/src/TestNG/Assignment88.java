
//There is a class in which 1BS, 1AS and 3 @Test, 1AM, 1BM, What will be the order of execution?
package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment88 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("AfterSuite");
	}
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
