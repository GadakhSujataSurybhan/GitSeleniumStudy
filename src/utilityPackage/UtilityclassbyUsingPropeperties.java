package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityclassbyUsingPropeperties {
	
		public static String ReadDatafrompropertyfile(String key) throws IOException
		{
			Properties obj = new Properties();
			FileInputStream myfile = new FileInputStream("C:\\Users\\sudarshan\\eclipse-workspace\\Selenium_Study\\KiteappPropertyfile.properties");
			obj.load(myfile);
			String value = obj.getProperty(key);
			return value;
		}
		 public static void takeScreenshort(WebDriver driver, int TCID) throws IOException
		 {
			 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File destination= new File("C:\\Users\\sudarshan\\Documents\\screenshort\\"+TCID+"screenshort.png");
				FileHandler.copy(source, destination);
				Reporter.log("screenshot taken for TC " +TCID,true); 
		 }

		
	

}
