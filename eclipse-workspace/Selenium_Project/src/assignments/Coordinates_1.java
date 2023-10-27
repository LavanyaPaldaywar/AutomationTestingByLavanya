
//Launch amazon india and find coordinates of canada link

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates_1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement text = driver.findElement(By.linkText("Canada"));
		Point locationofelement =text.getLocation();
		int x =locationofelement.getX();
		System.out.println(x);
		int y =locationofelement.getY();
		System.out.println(y);
	}

}
