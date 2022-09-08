package webelement_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		////Locator type->Link text
		driver.findElement(By.linkText("Forgot password?")).click();
		//Locator type->Partial Link text
		//driver.findElement(By.partialLinkText("Forgot")).click();
		

	}

}
