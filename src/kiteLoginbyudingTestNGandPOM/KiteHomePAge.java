  package kiteLoginbyudingTestNGandPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePAge {
	//step1: variable declaration
	 @FindBy(xpath="//span[@class= 'user-id']") private WebElement userID;
	 @FindBy(xpath="//a[@href='/logout']")private WebElement logoutbutton;
//	 
//	 //create constructor
	 public KiteHomePAge(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
//	  //create method
	 public  String ActualuserID()
	 {
	
	   String actualuserID = userID.getText();
	return actualuserID;
		
//		if(ExpecteduserID.equals(ActualuserID))
//		{
//			System.out.println("UserID matching TC is passed ");
//		}
//		else {
//			System.out.println("UserID matching TC is failed ");
//		}
	 }
	  
	  public void ClickonLogout() throws InterruptedException
	  {
		  userID.click();
		  Thread.sleep(2000);
		  logoutbutton.click();
	  }

}
