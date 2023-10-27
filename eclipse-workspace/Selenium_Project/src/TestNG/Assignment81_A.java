

package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment81_A 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod");
	}
	@Test
	public void test()
	{
		System.out.println("Test");
	}
}
