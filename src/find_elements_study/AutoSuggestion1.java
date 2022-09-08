package find_elements_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement w: checkbox)
		{
			Thread.sleep(2000);
			w.click();
		
		}

		for(WebElement w: checkbox)
		{
			Thread.sleep(2000);
			w.click();
		
		}

		
		
	}

}
