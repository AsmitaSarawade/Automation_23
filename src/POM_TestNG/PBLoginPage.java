package POM_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage {
	//Declare Webelement  with private access specifier and  Create annotation FindBy and  pass the xpath init. 
	@FindBy(xpath="//a[@class='sign-in']") private WebElement Signin;
	
	//create constructor and pass driver in it.
	//Inside we call initElement static method to access driver from main class and call the global variable(i.e Webelement Singin) 
	//of pageFactory class. 
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //classname.methodname
	}
	
	public void clickOnSignInBtn()
	{
		Signin.click();
	}

}
