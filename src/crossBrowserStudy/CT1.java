package crossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CT1 {
	@Parameters("browserName")
  @Test
  public void crossbrowser(String browserName) throws InterruptedException {
	  WebDriver driver=null;
	 if(browserName.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
			 driver = new ChromeDriver();
	 }
	 else if(browserName.equals("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	 }
	 driver.get("https://vctcpune.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.close();
  }
}
