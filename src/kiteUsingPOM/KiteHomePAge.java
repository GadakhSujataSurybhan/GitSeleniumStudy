  package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePAge {
	//step1: variable declaration
	 @FindBy(xpath="//span[@class= 'user-id']") private WebElement UserID;
	 @FindBy(xpath="//a[@href='/logout']")private WebElement logoutbutton;
	 
	 //create constructor
	 public KiteHomePAge(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	  //create method
	 public void ValidateUserID()
	 {
		String ExpecteduserID = "HD5857";
		String ActualuserID = UserID.getText();
		if(ExpecteduserID.equals(ActualuserID))
		{
			System.out.println("UserID matching TC is passed ");
		}
		else {
			System.out.println("UserID matching TC is failed ");
		}
	 }
	  
	  public void ClickonLogout() throws InterruptedException
	  {
		  UserID.click();
		  Thread.sleep(2000);
		  logoutbutton.click();
	  }

}
