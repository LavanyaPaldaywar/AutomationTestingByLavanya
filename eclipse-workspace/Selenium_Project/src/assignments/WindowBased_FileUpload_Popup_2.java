

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBased_FileUpload_Popup_2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easyupload.io/");

		Thread.sleep(2000);
		
		WebElement button=driver.findElement(By.xpath("//button[@class='dz-button']"));
		button.click();
		button.sendKeys("C:\\Users\\lavan\\Downloads\\sample.pdf");
		
		hread.sleep(4000);
		//not working
		
		
		
	}

}
