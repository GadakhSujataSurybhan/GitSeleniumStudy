package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodawithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream MyFile = new FileInputStream("C:\\webdriver\\exsheets.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("sheet3");
		String username = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String pin = mysheet.getRow(0).getCell(2).getStringCellValue();
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("userid")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		Thread.sleep(2000);
		driver.findElement(By.id("pin")).sendKeys(pin);
		button.click();
		Thread.sleep(2000);
		String expectedusername = username;
		
		 WebElement Username1 = driver.findElement(By.xpath("//span[@class= 'user-id']"));
		 String actualusername = Username1.getText();
		if(expectedusername.equals(actualusername))
		{
			System.out.println("User name is matching TC is passed");
		}
		else {
			System.out.println("User name is not matching TC is failed");
		}
		Thread.sleep(2000);
		Username1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();//clicking on logout button
		Thread.sleep(2000);
		driver.close();

	}

}
