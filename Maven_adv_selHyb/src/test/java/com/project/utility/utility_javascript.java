package com.project.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_javascript {
  public static void enter_disab(WebDriver driver, String data , WebElement elem)
  {
	  JavascriptExecutor jss = utility_object.javascript(driver);
	  jss.executeScript("arguments[0].Value='"+data+"'", elem);
  }
  public static void Scroll_elem(WebDriver driver, WebElement elem)
  {
	  JavascriptExecutor jss = utility_object.javascript(driver);
	  jss.executeScript("arguments[0].scrollIntoView();", elem);
  }
}
