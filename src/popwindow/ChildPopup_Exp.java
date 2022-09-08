package popwindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup_Exp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		String mainpageid = driver.getWindowHandle();
		System.out.println("the id of main page is "+mainpageid);
		Set<String> childpageid = driver.getWindowHandles();
		System.out.println("the id of multiple page is"+childpageid);
		Iterator<String> IT = childpageid.iterator();
		String idofmainpage = IT.next();
		String idofchildpage = IT.next();
		driver.switchTo().window(idofchildpage);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Confidance");
		Thread.sleep(2000);
		driver.close();
		driver.navigate().refresh();
	
		
		
	}

}
