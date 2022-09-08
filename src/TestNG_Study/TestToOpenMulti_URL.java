package TestNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestToOpenMulti_URL {
  @Test
  public void method1() {
	  System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/alerts");
  }
  @Test
  public void method2() {
	  System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://skpatro.github.io/demo/links/");
  }
  @Test
  public void method3() {
	  System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.flipkart.com/");
  }
  @Test
  public void method4() {
	  System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://vctcpune.com/selenium/practice.html");
  }
}
