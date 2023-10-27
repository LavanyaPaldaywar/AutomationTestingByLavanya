
//How to set priority to @Test annotation?

package TestNG;

import org.testng.annotations.Test;

public class Assignment91 
{
	@Test(priority=-1)
	public void testcase1()
	{
		System.out.println("testcase 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("testcase 2");
	}

}
