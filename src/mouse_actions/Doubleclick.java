package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		//1st way to used double click method
		act.doubleClick(doubleclickbutton).perform();
		//2st way to used double click method
		act.moveToElement(doubleclickbutton).doubleClick().build().perform();
		
	}

}
