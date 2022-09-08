package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("userid")).sendKeys("HD5857");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Ajinkya@123");
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		Thread.sleep(2000);
		driver.findElement(By.id("pin")).sendKeys("969696");
		button.click();
		Thread.sleep(2000);
		String expectedusername = "HD5857";
		
		 WebElement username = driver.findElement(By.xpath("//span[@class= 'user-id']"));
		 String actualusername = username.getText();
		if(expectedusername.equals(actualusername))
		{
			System.out.println("User name is matching TC is passed");
		}
		else {
			System.out.println("User name is not matching TC is failed");
		}
		Thread.sleep(2000);
		username.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();//clicking on logout button
		Thread.sleep(2000);
		driver.close();

	}

}
