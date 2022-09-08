package webelement_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
		boolean option1status = option1.isSelected();
		if(option1status)
		{
			System.out.println("Already option selected");
		}
		else
		{
			System.out.println("option button is not selected");
			option1.click();
			System.out.println("Now it is click on option button");
			
		}
		
		

	}

}
