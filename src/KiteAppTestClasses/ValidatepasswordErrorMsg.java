package KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseDetails;
import POMClasses.KiteHomePage;
import POMClasses.KiteLoginPage;
import POMClasses.KitePinPage;
import utilityPackage.UtilityClass;

public class ValidatepasswordErrorMsg extends BaseDetails {
	KiteLoginPage login;
	
	
	
@BeforeClass
public void launchThebrowser()
{
	launchBrowser();
	 login = new KiteLoginPage(driver);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
}
@BeforeMethod
public void loginintoKiteapp() throws EncryptedDocumentException, IOException
{
	login.enteruserID(UtilityClass.ReadDetaFromexcel(0, 0));
	 Reporter.log("enter userID", true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	login.clickonloginbutton();
	 Reporter.log("successfully clicking on login button", true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
  @Test
  public void validatePWDerrormsg() throws EncryptedDocumentException, IOException {
	  int TCID=204;
	  String ExpectedErrormsg = UtilityClass.ReadDetaFromexcel(0, 3);
	  String actualerrormsg = login.errormsgOfpassword();
	  Assert.assertEquals(actualerrormsg, ExpectedErrormsg, "actaul error msg and expected eroor msg not same");
	  Reporter.log("we getting PWD error msg", true);
	 UtilityClass.takeScreenshort(driver, TCID);
		 Reporter.log("taking screenshot of PWD error msg", true); 
  }
  
  @AfterClass
  public void browserClose()
  {
	  closeBrowser();
  }
}
