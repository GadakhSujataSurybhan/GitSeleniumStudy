package crossBrowserStudy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firefox_browser {
	
  @Test
  public void fmethod() throws InterruptedException {
	  
			 System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
			 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://vctcpune.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();
	  }
  
}
  

