package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleExamplePopup 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=EAIaIQobChMIxKWj87CRgQMVYQ17Bx23LgcvEAAYASAAEgLZHPD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		driver.findElement(By.xpath("//span[.='Google']")).click();
		
		System.out.println("\n");
	
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		String Parent = driver.getWindowHandle();
		Set<String> ParentAndChild = driver.getWindowHandles();
		System.out.println(Parent);
		System.out.println(ParentAndChild);
		
		
	}

}
