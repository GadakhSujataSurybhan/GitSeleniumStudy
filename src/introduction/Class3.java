package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		driver.findElement(By.xpath("//*[@name=\"search_query\"]")).sendKeys("My demons naruto");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(30000);
//		driver.findElement(By.xpath("//img[@src=\"https://i.ytimg.com/vi/TGrOOJcBWXo/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB18NqHKBl-13_dG-rC758q8rg6jA\"]")).click();
//	      driver.findElement(By.xpath("//img[@src=\"https://i.ytimg.com/vi/LSvOTw8UH6s/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCr2uKajmFqzxyIGecEO58X8SmUlw\"]")).click();
	      driver.findElement(By.xpath("//img[@src=\"https://i.ytimg.com/vi/z7h2e_GTTek/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAnRthg_WDZ7RfCksJdUbXz3-iXdw\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@title=\"Full screen (f)\"]")).click();
	}

}
