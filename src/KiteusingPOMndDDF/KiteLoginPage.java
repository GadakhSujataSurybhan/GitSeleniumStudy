package KiteusingPOMndDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	@FindBy(id="userid")private WebElement userID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	
//Step 2: create constructor 
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
//3 creat method
	public void enteruserID(String username)
	{
	 userID.sendKeys(username);
	}
	public void enterpassword(String password)
	{
	 userID.sendKeys(password);
	}
	public void clickonloginbutton()
	{
		LoginButton.click();
	}
}
