package tests;

import org.testng.annotations.Test;

import data.DataFiles;
import page.GmailLoginPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class GmailLoginTest {
	
	GmailLoginPage lp = new GmailLoginPage();
	
	DataFiles df = new DataFiles();
	
	
//	String blankErr = "Enter an email or phone number";
//	String wrongErr = "Couldn’t find your Google Account";
//	String invalidErr = "Enter a valid email or phone number";
//	String wrongEmail = "Enter an email or phone number";
//	String specialCharEmail = "Enter an email or phone number";
	
	
  @Test(priority = 1)
  public void blankEmailTest() {
	  //driver.findElement(By.id("identifierId")).sendKeys("");
	 // driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	  lp.login("");
	  
	  String experr  = df.blankErr;
	  String acterr = lp.emptyErr();
	  Assert.assertEquals(acterr, experr);
  }
  
  @Test(priority = 2)
  public void wrongEmailTest() {
	 lp.login("lhfnobeo");
	  
	  String experr  = df.wrongErr;
	 String acterr=  lp.WrongErr();
	  Assert.assertEquals(acterr, experr);
  }
  
  @Test(priority = 3)
  public void specialCharEmailTest() {
	 lp.login("jbvfofo@#$");
	  
	  String experr  = df.invalidErr;
	  String acterr = lp.specialCharErr();
	  
	  Assert.assertEquals(acterr, experr);
  }
  @BeforeMethod
  public void beforeMethod() {
	 lp.openBrowser();
		
		lp.openGmailPage();
	  
  }

  @AfterMethod
  public void afterMethod() {
	 lp.closeBrowser();
  }

}
