package POM_Testng_FDD_Utility_Base_Properties;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class PBProfileHomePage {
	@FindBy(xpath = "//input[@name='personName']") private WebElement fullName;
	WebDriver driver1;

	
	public  PBProfileHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchToSwitchChildWindow()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	
	public String getFullName() 
	{
		String actName = fullName.getAttribute("value");
		return actName;
	//	if(actName.equals(expName))
		//{
		//	System.out.println("TC Pass");
	//	}
		//else
		//{
		//	System.out.println("TC Fail");
		//}		
	}
}
