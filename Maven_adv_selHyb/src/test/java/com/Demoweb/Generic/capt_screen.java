package com.Demoweb.Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class capt_screen {

public static void getpicture(WebDriver driver) throws IOException 
{
	Date d=new Date();
	String t = d.toString();
	String d1 = t.replaceAll(":", "-");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File tem = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("./Picture/"+d1+".jpg");
	FileHandler.copy(tem, dst);
}
}
