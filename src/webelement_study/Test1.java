package webelement_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=qeDEWa7KBOrx8AeH7JXoBg&gws_rd=ssl");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("selenium java");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[text()='selenium java'])[1]")).click();
	    Thread.sleep(3000);
	   String expectedresults = "About 4,99,00,000 results";
	  WebElement results = driver.findElement(By.xpath("//div[@id='result-stats']"));
	  String actualresult = results.getText();
	  if(actualresult.equals(expectedresults))
	  {
		  System.out.println("test case pass");
	  }
	  else
	  {
		 System.out.println("it is failed"); 
	  }
	  
		
		
	}

}
