package BaseClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Baseclass1 {
	protected static WebDriver driver;
	 public void launchBrowser()
	 {
		 Reporter.log("Launching browser",true);
		 System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
//		  ChromeOptions opt = new ChromeOptions();
//		 opt.addArguments("--disable-notifications");
//			driver= new ChromeDriver(opt);
		  driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			driver.manage().window().maximize();
			Reporter.log("Browserlaunched sussess",true);
	 }
	 public void  takescreenshort(String TCName) throws IOException
	 { 
		 
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File destination= new File("C:\\Users\\sudarshan\\Documents\\screenshort\\"+TCName+"screenshort.png");
	 org.openqa.selenium.io.FileHandler.copy(source, destination);
		Reporter.log("screenshot taken for TC " +TCName,true);
		 
	 }
	 public void closeBrowser()
	 {
		 driver.close();
		 Reporter.log("Browser closed sussess",true); 
	 }

	
}
