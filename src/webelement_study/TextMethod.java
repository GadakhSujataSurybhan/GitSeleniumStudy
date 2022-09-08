package webelement_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement pagetitle = driver.findElement(By.xpath("//h1[contains(text(),'Welcome To ')]"));
		String atualtext = pagetitle.getText();
		String Expectedtext= "Welcome To Practice Page";
		if(atualtext.equalsIgnoreCase(Expectedtext))
		{
			System.out.println("conted is matched,TC pass");
		}
		else
		{

			System.out.println("conted is matched,TC failed");
		}
		
		
		
		
		
		
		

	}

}
