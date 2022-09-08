package drop_down_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBoxMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement multiselectDropdown = driver.findElement(By.id("cars"));
		Select s = new Select(multiselectDropdown);
		boolean result = s.isMultiple();
		System.out.println("multiple value is available ="+result);
		Thread.sleep(2000);
		s.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		s.selectByValue("opel");
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println("First selected option is "+s.getFirstSelectedOption().getText());
		s.deselectByValue("volvo");
		
		
				
	}

}
