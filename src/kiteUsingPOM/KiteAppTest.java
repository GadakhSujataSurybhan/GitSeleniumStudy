package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KiteAppTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		//create object of kiteloginpage
		KiteLoginPage login = new KiteLoginPage(driver);
		login.enterUserID();
		login.enterPassword();
		login.clickOnLoginButton();
		Thread.sleep(2000);
		//create object of pinpage
		
		
		KitePinPage pinpage = new KitePinPage(driver);
		pinpage.enterpin();
		pinpage.clickonContinueButton();
		Thread.sleep(2000);
		//create object of homepage
		KiteHomePAge homepage= new KiteHomePAge(driver);
		Thread.sleep(2000);
		homepage.ValidateUserID();
		homepage.ClickonLogout();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
