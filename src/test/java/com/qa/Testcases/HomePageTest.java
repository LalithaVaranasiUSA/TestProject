package com.qa.Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LearnPage;

public class HomePageTest extends TestBase {
	HomePage home;
	LearnPage login;

	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	  public void setUp() throws InterruptedException {
		initialization();
		Thread.sleep(10000);
		home=new HomePage();		
	  }
	@Test(priority=1)
    public void HomePageTitleTest() throws InterruptedException {
		 Thread.sleep(10000);
		 assertEquals(home.validHomePageTitle(),"AngularJS — Superheroic JavaScript MVW Framework");
   }
	 //	@Test(priority=2)
	 public void loginTest() throws InterruptedException
	 {
		 Thread.sleep(10000);
		 login=home.login();
	 }
	
	
	@AfterMethod
	  public void tearDown()
	  {
		
		driver.quit();
	  }
}
