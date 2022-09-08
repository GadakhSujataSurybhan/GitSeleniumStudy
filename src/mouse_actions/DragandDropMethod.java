package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/dragndrop/");
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(source, target).perform();
		act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
	}

}
