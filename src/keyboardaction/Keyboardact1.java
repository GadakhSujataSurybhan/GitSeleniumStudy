package keyboardaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardact1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
      org.openqa.selenium.WebElement day = driver.findElement(By.id("day"));
		Actions act= new Actions(driver);
		act.click(day).perform();
		Thread.sleep(2000);
		for(int i=0; i<20-1; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();

	}

		for(int i=0; i<10-1; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			
		}
		act.sendKeys(Keys.ENTER).perform();
		org.openqa.selenium.WebElement firstnameinfo = driver.findElement(By.name("firstname"));
		act.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("ujata").build().perform();
}
}
			
