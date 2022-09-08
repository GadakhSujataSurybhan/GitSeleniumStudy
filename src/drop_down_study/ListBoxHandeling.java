package drop_down_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandeling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		//step1: 1.	Identify list box to be handled and store it in reference variable
		WebElement Selectbutton = driver.findElement(By.id("dropdown-class-example"));
		//step2:2.	Create an object of Select class which will accept WebElement as argument
		Select s = new Select(Selectbutton);
		//step3:3.	By using one of the select class methods we can select values form list box like 
		s.selectByVisibleText("Option2");
		Thread.sleep(2000);
		s.selectByValue("option3");
		s.selectByIndex(1);
	
	}

}
