package SerialAndParallelExceution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialParellel2 {
  @Test
  public void method1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.close();
  }
}
