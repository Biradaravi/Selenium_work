package com.Demoweb.Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_scriptDemo implements Fram_constant {
	public WebDriver driver;

@BeforeMethod
public void OpenApp()
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	driver=new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(base_url);
	
}
@AfterMethod
public void closeApp(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		capt_screen.getpicture(driver);
	}
	driver.close();
}
}


