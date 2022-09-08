package KiteusingPOMndDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestingwithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);	
		FileInputStream MyFile = new FileInputStream("C:\\webdriver\\exsheets.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("sheet3");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN= mysheet.getRow(0).getCell(2).getStringCellValue();
		Thread.sleep(1000);
		KiteLoginPage login = new KiteLoginPage(driver);
		login.enteruserID(PIN);
		login.enterpassword(PWD);
		login.clickonloginbutton();
		Thread.sleep(1000);
		
		KitePinPage pin= new KitePinPage(driver);
		pin.enterpin(PIN);
		pin.clickoncontinue();
		Thread.sleep(1000);
		
		KiteHomePage home = new KiteHomePage(driver);
		home.ValidateUserID(UN);
		home.ClickonLogout();
		driver.close();
		
	}

}
