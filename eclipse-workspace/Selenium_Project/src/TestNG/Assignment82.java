
//There is a class which will have Aftermethod,BeforeMethod,Test and AfterSuite and what is the order of execution.

package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment82 
{
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void test()
	{
		System.out.println("Test");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("AfterSuite");
	}
	
}
