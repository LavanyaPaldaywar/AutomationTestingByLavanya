
//In a class use all 9  annotations of testng and check what is the order of execution

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

public class Assignment81
{
	@Test
	public void test()
	{
		System.out.println("Test");
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