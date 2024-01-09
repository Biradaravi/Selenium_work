package com.Demoweb.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_demo {
@FindBy(id = "Email")
private WebElement emai_tx;
@FindBy(id = "Password")
private WebElement pass_tx;
@FindBy(xpath = "(//input[@type='submit'])[2]")
private WebElement cli_bt;

public Pom_demo(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement enter_em() {
	return emai_tx;
}
public WebElement ent_pass()
{
	return pass_tx;
}
public WebElement click_btn()
{
	return cli_bt;
}

}
