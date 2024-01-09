package com.project.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_action_genaric {
   public static void mouseHover(WebDriver driver, WebElement tgt)
   {
	   utility_object.Actions_object(driver).moveToElement(tgt).perform();
   }
   public static void click_hold(WebDriver driver, WebElement elem)
   {
	   utility_object.Actions_object(driver).clickAndHold(elem).perform();
   }
   public static void Right_cclick(WebDriver driver, WebElement elem)
   {
	   utility_object.Actions_object(driver).contextClick(elem).perform();
   }
   public static void dubl_click(WebDriver driver, WebElement elem)
   {
	   utility_object.Actions_object(driver).doubleClick(elem).perform();
   }

}
