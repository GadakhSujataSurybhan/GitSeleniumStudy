package BaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseclassByUsingPropertiesfile {

	protected WebDriver driver;
	 public void launchBrowser()
	 {
		 Reporter.log("Launching browser",true);
		 System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
//		  ChromeOptions opt = new ChromeOptions();
//		 opt.addArguments("--disable-notifications");
//			driver= new ChromeDriver(opt);
		  driver.get("URL");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			driver.manage().window().maximize();
			Reporter.log("Browserlaunched sussess",true);
	 }
	 public void closeBrowser()
	 {
		 driver.close();
		 Reporter.log("Browser closed sussess",true); 
	 }
}
