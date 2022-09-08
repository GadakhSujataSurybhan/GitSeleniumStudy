package webelement_study;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email_id = driver.findElement(By.xpath("//input[@id='email']"));
		email_id.sendKeys("7350143035");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Sujata@12");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		String actualText = login.getText();
		String Expected ="in";
		if(actualText.equalsIgnoreCase(Expected))
		{
			
		System.out.println("conted is matched, TC is pass");
		}
		else
		{
			System.out.println("conted is not matched,TC is failed");
			
			
		}

}
}
