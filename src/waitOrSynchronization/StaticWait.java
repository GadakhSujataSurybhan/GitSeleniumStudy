package waitOrSynchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
        Thread.sleep(1000);
		
		//checking Get OTP button is enabled or not
        WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
    
		
		boolean ButtonStatus = getOTPButton.isEnabled();
	}

}
