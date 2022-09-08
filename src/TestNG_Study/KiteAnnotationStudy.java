package TestNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class KiteAnnotationStudy {
  @Test
  public void validateUserID() {
	  Reporter.log("userID validate,Test case is passed");
  }
  @BeforeMethod
  public void LoginIntoKite() {
	  Reporter.log(" entre valid input on required field");
  }

  @AfterMethod
  public void LogoutIntokite() {
	  Reporter.log("logout from application");
  }

  @BeforeClass
  public void Launchbrowser() {
	  Reporter.log("launch the browser");
  }

  @AfterClass
  public void clsoedbrowser() {
	  Reporter.log("closed the browser");
  }

}
