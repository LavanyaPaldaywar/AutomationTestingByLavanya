package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_1
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement checkbox =driver.findElement(By.xpath("((//div[@id='deliveryRefinements'])/ul/span)[2]"));
		
		boolean selected1 = checkbox.isSelected();
		System.out.println(selected1);
		
		Thread.sleep(5000);
		
		checkbox.click();
		not working   //WebElement checkboxafterselection = driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[2]"));
		boolean selected2 = checkboxafterselection.isSelected();
		System.out.println(selected2);
		
		
}
}
