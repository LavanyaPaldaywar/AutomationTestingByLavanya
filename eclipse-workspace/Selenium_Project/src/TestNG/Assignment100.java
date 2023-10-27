
//Run a random method for 1000 times using for loop
package TestNG;

import org.testng.annotations.Test;

public class Assignment100 
{
	@Test
	public void random()
	{
		for(int i=0;i<=1000;i++)
		{
			System.out.println(i);
			System.out.println(Math.random());
		}
	}
}
