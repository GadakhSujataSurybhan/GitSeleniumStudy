package kiteLoginbyudingTestNGandPOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KiteTestUsingTestNG {
	WebDriver driver;
	Sheet Mysheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePAge home; 
	@Parameters("browserName")
	
	@BeforeClass 
	public void  launchBrowser(String browser) throws EncryptedDocumentException, IOException
	{
		if(browser.equals("chrome")) 
		{
		
		Reporter.log("Launching browser",true);
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
	  driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
	  {
			 System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
	  }
	  driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		Reporter.log("Browserlaunched sussess",true);
		FileInputStream MyFile = new FileInputStream("C:\\webdriver\\exsheets.xlsx");
	    Mysheet = WorkbookFactory.create(MyFile).getSheet("sheet3");
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
	   home = new KiteHomePAge(driver);

	}
	@BeforeMethod
	public void loginToKiteApp()
	{
		String USERID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		Reporter.log("Entering UserID and Password ",true);
		login.enterUserID();
		login.enterPassword();
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Entering PIN",true);
		pin.enterpin();
		pin.clickonContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
   
    @Test
    public void validateUserID() {
    	Reporter.log("validating userID",true);
    	String expectedUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
    	String actualUserID = home.ActualuserID();
    	Assert.assertEquals(actualUserID, expectedUserID, "actual and expected useriD not matching");
    	Reporter.log("User ID validated suceesfully, TC is passed",true);	
  }
    @AfterMethod
    public void logoutfromkiteapp() throws InterruptedException
    {
    	Reporter.log("Logging out...",true);
    	home.ClickonLogout();
    }
    @AfterClass
    public void closeBrowser()
    {
    Reporter.log("closing browser",true);
    driver.close();
    }
}
