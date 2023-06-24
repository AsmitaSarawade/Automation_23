package POM_Testng_FDD_Utility_Base_Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMnoPage {
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement  Mno;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement  SinginWithPass; 
	
	PBMnoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Entermno(String mobileno)
	{
		Mno.sendKeys(mobileno);
	}
	
	public void ClickonSingin()
	{
		SinginWithPass.click();
	}

}
