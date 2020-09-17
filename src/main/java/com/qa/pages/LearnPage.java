package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;


public class LearnPage extends TestBase {
	public LearnPage()
	{
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	public String verifyLoginPageTitle()
	{
		return(driver.getTitle());
	}

}
