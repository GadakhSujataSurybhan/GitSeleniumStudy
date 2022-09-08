package webelement_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(3000);
		WebElement getOTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		WebElement MobNoFeild = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		boolean OTPbuttonStatus = getOTPbutton.isEnabled();
		
		if(OTPbuttonStatus)
		{
			getOTPbutton.click();
			System.out.println("Get OTP is alreday enabled ");
		}
		else
		{
			
			System.out.print("get OTP button is disabled, entering mobile number");
			MobNoFeild.sendKeys("7350143035");
			getOTPbutton.click();
			Thread.sleep(3000);
			System.out.println("OTP send to your mob.no, pls check");
			
		}
		

}

}