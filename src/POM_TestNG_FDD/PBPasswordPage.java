package POM_TestNG_FDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPasswordPage {
	@FindBy(xpath="//input[@name='password']")private WebElement password1;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement Signin;
	
	PBPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enterpass(String password)
	{
		password1.sendKeys(password);
	}
	
	public void Singin()
	{
		Signin.click();
	}

}
