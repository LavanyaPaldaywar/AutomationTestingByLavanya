package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_Example2 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//input)[4]")).sendKeys("shoe");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoe");//using formula of relative xpath
	}

}
