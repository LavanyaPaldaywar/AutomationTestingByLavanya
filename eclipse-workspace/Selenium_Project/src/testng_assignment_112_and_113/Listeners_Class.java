package testng_assignment_112_and_113;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_Class implements ITestListener
{
	Test_Case t1 = new Test_Case();
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("Test Failed with timeout");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test Failed");
		TakesScreenshot s2 = t1.driver;
		File f2 = s2.getScreenshotAs(OutputType.FILE);//SOURCE
		File object2 = new File("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\Screenshot\\Failed_" + Math.random() + ".png");
		try {
			FileUtils.copyFile(f2, object2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test Skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test Success");
		TakesScreenshot s1 = t1.driver;
		File f1 = s1.getScreenshotAs(OutputType.FILE);//SOURCE
		File object = new File("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\Screenshot\\Pass_" + Math.random() + ".png");
		try {
			FileUtils.copyFile(f1, object);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
