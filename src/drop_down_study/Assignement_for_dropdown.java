package drop_down_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement_for_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		//Select by visible text method
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		Thread.sleep(2000);
		s.selectByVisibleText("10");
		Thread.sleep(2000);
		//Select by index method
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1 = new Select(month);
		s1.selectByIndex(4);
		Thread.sleep(2000);
		//Select by value method
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2 = new Select(year);
		s2.selectByValue("2020");
		

	}

}
