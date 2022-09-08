package KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseclassByUsingPropertiesfile;
import POMClasses.KiteHomePage;
import POMClasses.KiteLoginPage;
import POMClasses.KitePinPage;
import utilityPackage.UtilityclassbyUsingPropeperties;

public class validatekiteapplnbyUsingpropertyfile extends BaseclassByUsingPropertiesfile{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	int TCID=500;
	@BeforeClass
	public void LaunchingBrowser() throws IOException {
		launchBrowser();
		 login = new KiteLoginPage(driver);
		 pin = new KitePinPage(driver);
		 home = new KiteHomePage(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	@BeforeMethod
	public void loginkiteAppln() throws IOException
	{
	login.enteruserID(UtilityclassbyUsingPropeperties.ReadDatafrompropertyfile("UN"));
	login.enterpassword(UtilityclassbyUsingPropeperties.ReadDatafrompropertyfile("PWD"));
	login.clickonloginbutton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	pin.enterpin(UtilityclassbyUsingPropeperties.ReadDatafrompropertyfile("PIN"));
	pin.clickoncontinue();
	}
  @Test
  public void ValidateKiteUN() throws IOException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 String ExpectedUN = UtilityclassbyUsingPropeperties.ReadDatafrompropertyfile("UN");
	 String actualUN = home.ActualuserID();
	 Assert.assertEquals(actualUN, ExpectedUN, "Actaul UN and Expected UN not matching");
	 Reporter.log("Validated UserName", true);
//    UtilityclassbyUsingPropeperties.takeScreenshort(driver, TCID);
//    Reporter.log("Validated UserName", true); 
  }
  @AfterMethod
  public void logoutKiteappln(ITestResult result) throws InterruptedException, IOException
  {
	  if(result.getStatus()==result.FAILURE)
	  {
		  UtilityclassbyUsingPropeperties.takeScreenshort(driver, TCID);
	  }
	  else if (result.getStatus()==result.SKIP) 
	  {
	  Reporter.log("Your TC is Skipped please check", true);
	  }
	  else {
	  Reporter.log("Your TC is passed",true);
	  }
	  
//	  home.ClickonLogout();
//	  Reporter.log("Logging out", true);
  }
  @AfterClass 
  public void LogOutintoKiteappln()
  {
	  closeBrowser();
  }
}
