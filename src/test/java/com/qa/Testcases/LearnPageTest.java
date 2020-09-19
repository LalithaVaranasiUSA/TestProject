package com.qa.Testcases;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LearnPage;


public class LearnPageTest extends TestBase {
	HomePage hp;
	LearnPage lp;
	
	
	public LearnPageTest()
	{
		super();
	}
	
	 @BeforeMethod
	  public void setUp() {
		 initialization();
		 	 
	  }	
	 
	
	 @Test
	 public void loginTest()  {
		 try {
		 assertEquals(lp.verifyLoginPageTitle(),"Angular","NOT A CORRECT TITLE***********");
		 }catch(Exception e) {e.printStackTrace();}
		 }
 

  @AfterMethod
  public void tearDown() {
	  driver.quit(); 
  }

}
