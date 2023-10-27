package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAndChild_Popup_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Thread.sleep(2000);
		
		System.out.println("Before clicking on google link");
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		Set<String> ParentAndChild = driver.getWindowHandles();
		System.out.println(ParentAndChild);
		System.out.println("\n");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Google']")).click();
		
		System.out.println("After clicking on google link");
		String Parent1 = driver.getWindowHandle();
		System.out.println(Parent1);
		Set<String> ParentAndChild1 = driver.getWindowHandles();
		System.out.println(ParentAndChild1);
		System.out.println("\n");
		
		//Separate the parent and child id's got from getWindowHandles
		Iterator<String> a=ParentAndChild1.iterator();
		String ParentId = a.next();// this first next() will give parent id
		System.out.println("ParentId\t"  + ParentId);
		String FirstChildId = a.next();//this 2nd next() will give first child id
		System.out.println(("FirstChildId\t"+ FirstChildId));
		
		//moving control from parent to child
		driver.switchTo().window(FirstChildId);
		Thread.sleep(3000);
		driver.close();
	}

}
