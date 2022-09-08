package find_elements_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		List<WebElement> tablecontent = driver.findElements(By.xpath("//table[@id='product']//th"));
		System.out.println("table heading is "+tablecontent.size());
		for(WebElement w:tablecontent)
		{
			System.out.println("table heading is "+w.getText());
		}
		//System.out.println("table content is "+tablecontent.getText());
		Thread.sleep(2000);
		
//		WebElement tablerowcontent = driver.findElement(By.xpath("(//table[@id='product']//tr)[4]//td"));
//		System.out.println("table heading is "+tablerowcontent.getSize());
//		System.out.println("table content is "+tablerowcontent.getText());


	}

}
