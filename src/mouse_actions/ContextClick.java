package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		//first way to use context click method
		act.contextClick(rightclickbutton).perform();
		//second way to used contect click method
		act.moveToElement(rightclickbutton).click().build().perform();
		
		

	}

}
