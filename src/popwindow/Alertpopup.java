package popwindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(2000);
		Alert alr = driver.switchTo().alert();
		String result = alr.getText();
		System.out.println("text is "+result);
		alr.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		Thread.sleep(2000);
		Alert alr1 = driver.switchTo().alert();
		alr1.dismiss();

	}

}
