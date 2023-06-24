package POM_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccountPage {

	@FindBy(xpath="//div[text()='My Account']")private WebElement Myaccount;
	
	PBMyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonMyAcc()
	{
		Myaccount.click();
	}


}
