package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchUrlInEdgeBrowser 
{

	public static void main(String[] args) 
	{
		EdgeDriver e2 = new EdgeDriver();
		e2.get("https://www.grotechminds.com");
	}

}
