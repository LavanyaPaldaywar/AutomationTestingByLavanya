
//Window based or file upload popup

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBased_FileUpload_Popup_1
{

	public static void main(String[] args) throws InterruptedException 
	{	
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://grotechminds.com/registration/");
		
				Thread.sleep(2000);
		
				
				//file upload or window based popup
				driver.findElement(By.name("file-935")).sendKeys("C:\\Users\\lavan\\Downloads\\sample.pdf");
		
				Thread.sleep(2000);
		
				System.out.println("File uploaded");
				
	}

}
