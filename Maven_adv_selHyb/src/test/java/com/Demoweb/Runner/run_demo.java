package com.Demoweb.Runner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Demoweb.Generic.Base_scriptDemo;
import com.Demoweb.Pom.Pom_demo;

@Listeners(com.Demoweb.Generic.listennto.class)
public class run_demo extends Base_scriptDemo{
@Test
public void login() throws InterruptedException
{
	Pom_demo p=new Pom_demo(driver);
	p.enter_em().sendKeys(email);
	Thread.sleep(2000);
	p.ent_pass().sendKeys(pass);
	Thread.sleep(2000);
    p.click_btn().click();
	
}
}
