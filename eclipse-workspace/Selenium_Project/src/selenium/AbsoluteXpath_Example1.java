package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath_Example1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Lavanya");//username
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Lav");//hint
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Lav");//password
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Lavanya");//your first name
		//driver.findElement(By.xpath("(/html/body/form/input)[2]")).sendKeys("Paldaywar");// disabled field your last name
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();//submit of form1
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();//I have a boy
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();//I have a girl
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();//I have a baby
		//driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]")).click(); //submit of form2
		//driver.findElement(By.xpath("(/html/body/input)[4]")).click();//Male radio 
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();//Female radio 
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();//Are you ready to relocate to bangalore?
		driver.findElement(By.xpath("/html/body/a")).click();//Click to know about us
		//driver.findElement(By.xpath("(/html/body/input)[7]")).click();//signup
		
	
		

	}

}
