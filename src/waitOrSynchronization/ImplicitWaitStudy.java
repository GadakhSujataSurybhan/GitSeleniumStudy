package waitOrSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
	
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);// using before selenium 4 version
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));// using after selenium 4 version
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//checking Get OTP button is enabled or not
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean ButtonStatus = getOTPButton.isEnabled();


	}

}
