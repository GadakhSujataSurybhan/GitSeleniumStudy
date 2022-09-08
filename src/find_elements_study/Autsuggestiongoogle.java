package find_elements_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autsuggestiongoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("honda");
		Thread.sleep(2000);
		List<WebElement>searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));

		System.out.println("Total search results are "+searchResults.size());
		
		for(WebElement w:searchResults)
		{
			System.out.println(w.getText());
		}
		Thread.sleep(2000);
		for(WebElement w: searchResults)//0,1,---10
		{
			String ExpectedResult = "honda amaze";
			
			String ActualResult=w.getText();
			
			if(ActualResult.equals(ExpectedResult))

			{
				w.click();
				break;
			}
					}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();
		
		
		
		
	}

}
