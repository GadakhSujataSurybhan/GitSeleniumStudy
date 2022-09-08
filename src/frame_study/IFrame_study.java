package frame_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		//switching selenium focus to frame
		driver.switchTo().frame("\"iframeResult\"");
		WebElement clickmebutton = driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]"));
		Thread.sleep(2000);
		clickmebutton.click();
		Thread.sleep(2000);
		//switching back selenium focus to main page
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//taking action on elements on main page
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();

	}

}
