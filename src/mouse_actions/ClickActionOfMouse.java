package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActionOfMouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement Homebutton = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		//using Actions classs--> how to click
		//1. create an object of ACtions Class and pass driver object
		Actions act = new Actions(driver);
		//2.use ACtions class object and call method call perform method--> click(WebElement target)
		//1st way to click
		act.click(Homebutton).perform();
		Thread.sleep(2000);
		//2nd way to click
		//act.moveToElement(Homebutton).perform();
		//Thread.sleep(2000);
		//act.click().perform();
		
		
		
	}

}
