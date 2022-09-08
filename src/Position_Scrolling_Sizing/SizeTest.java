package Position_Scrolling_Sizing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getSize());
		//default value (1050, 660)
		//create an object of dimension class which will accept width and height
		Dimension d = new Dimension( 200, 500);
		//2. use set size method by passing dimention class object.
		driver.manage().window().setSize(d);
	

	}

}
