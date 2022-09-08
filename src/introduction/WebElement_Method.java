package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		System.out.println( "Displayed status " +Firstname.isDisplayed());
		System.out.println( "Enable status " +Firstname.isEnabled());
		//WebElement checkavaliability = driver.findElement(By.xpath("//*[@id=\"check-availability-button\"]"));
		//checkavaliability.isSelected();
		//System.out.println("Selected status is "+checkavaliability.isSelected());
		//checkavaliability.click();
		//System.out.println("Selected status is "+checkavaliability.isSelected());
//		WebElement company = driver.findElement(By.xpath("//*[@id=\"Details_CompanyIndustryId\"]"));
//		System.out.println("Status is "+company.isSelected());
//		company.click();
//		System.out.println("Status is "+company.isSelected());
		WebElement multi = driver.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div//a"));
		
		
		
	
	
		
		
	}

}
