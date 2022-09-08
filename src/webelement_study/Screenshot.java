package webelement_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		RandomString str = new RandomString(4);
		File destination= new File("C:\\Users\\sudarshan\\Documents\\screenshort\\"+str+"screenshort1.png");
		FileHandler.copy(source, destination);
	}

}
