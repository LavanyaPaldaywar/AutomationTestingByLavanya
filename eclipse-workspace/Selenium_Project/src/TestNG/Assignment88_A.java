package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment88_A 
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
}
