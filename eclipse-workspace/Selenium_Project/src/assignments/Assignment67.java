
//Launching Edge Browser and getting title.

package assignments;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment67 
{

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
