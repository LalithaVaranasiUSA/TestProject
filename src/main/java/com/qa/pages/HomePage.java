package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;


public class HomePage extends TestBase{
	@FindBy(xpath="/html/body[@class='homepage ng-scope']/div[2]//a[@href='https://angular.io']")
	WebElement learnBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public LearnPage login()
	{
		learnBtn.click();
		return(new LearnPage());	 
	}
	

}
