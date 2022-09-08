package Position_Scrolling_Sizing;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position_Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getPosition());
		//1.create object of point class, which will accept x and y cordinate 
		//(10,10)--> default value
		Point p = new Point(100, 200);
		//2. use set position method by passing point class object.
		driver.manage().window().setPosition(p);
		//to get current position use getPosition method
		//System.out.println(driver.manage().window().getPosition());

	
		

	}

}
