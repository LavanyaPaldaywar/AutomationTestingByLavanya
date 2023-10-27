
//There is a class which have all 9 annotations and you have extra @Test, What will be the order of an execution?
package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment84 
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
	@BeforeTest
	public void beforetest()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("AfterTest");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod");
	}
	@BeforeMethod
	public void beforementhod()
	{
		System.out.println("BeforeMethod");
	}
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
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("AfterClass");
	}
}
