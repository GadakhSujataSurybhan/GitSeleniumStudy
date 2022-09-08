package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		//1.	xpath by attribute
		//driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Suajta");
		//2.	xpath by text
		//driver.findElement(By.xpath("//label[text() ='Confirm email:']")).click();
		//I.	Contains with text() 
		//driver.findElement(By.xpath("//label[contains(text(),'How many people work')]")).click();
		//II.	Contains with attribute :
		//driver.findElement(By.xpath("//label[contains(@for,'_CompanyRoleId')]")).click();
		//locator by using ID
		//driver.findElement(By.id("ConfirmPassword")).sendKeys("Sujata@12");
		//locator by using name
		//driver.findElement(By.name("register-button")).click();
		//locator by using 
		driver.findElement(By.className("ico-user sprite-image")).click();
	}

}