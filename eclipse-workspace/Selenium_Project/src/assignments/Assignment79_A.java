
//Launch amazon.in , search for product and click on first product and click on add to cart button.
//How to select single item from multiple items(from all shoes select 4th shoe).

package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment79_A 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		//using common class and provide indexing
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[4]")).click();
		
		System.out.println("child opened");
		
		Thread.sleep(2000);
		
		//Handles
		Set<String> ParentAndChild = driver.getWindowHandles();
		Iterator<String> a =ParentAndChild.iterator();
		String Parent = a.next();
		System.out.println("Parentid\t" +Parent);
		String Child = a.next();
		System.out.println("Childid\t" +Child);
		
		//moving control from parent to child to add product
		driver.switchTo().window(Child);
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		
		//moving control to parent
		driver.switchTo().window(Parent);
		Thread.sleep(2000);
		
		driver.close();
		

		
		
		
		
	}

}
