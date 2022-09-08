package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	     
		driver.get("https://www.youtube.com/");
		 driver.get("https://www.google.com/");
		 
	//	driver.getTitle();
	   
	  // System.setProperty("webdriver.edge.driver","C:\\webdriver\\msedgedriver.exe");
		//EdgeDriver driver1 = new EdgeDriver();
		//driver1.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
	    driver.get("https://www.google.com/");
	    Thread.sleep(1000);
	    String title=driver.getTitle();
	    System.out.println(title);
	    Thread.sleep(1000);
	    String titile2 = driver.getCurrentUrl();
	    System.out.println(titile2);
	    Thread.sleep(1000);
	    System.out.println(driver.getPageSource());
	    Thread.sleep(1000);
	     driver.close();
		 
		
		
//		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Flogin");
//		 WebElement lastname=driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
//		 System.out.println("Display status is " + lastname.isDisplayed());
//		 System.out.println("Display status is " + lastname.isEnabled());
//		 WebElement country = driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
//		 System.out.println("Display status is "+country.isSelected());

	
	}
}
