

package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods_1
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/"); //driver.navigate().to();
		System.out.println("Launched url");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back method");

		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate forward method");

		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println("Navigate refresh method");
	}

}
