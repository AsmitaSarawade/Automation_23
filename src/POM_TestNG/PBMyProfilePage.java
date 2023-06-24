package POM_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage {
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement MyProfie;
	WebDriver dri;
	
	PBMyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		dri=driver;
	}
	
	public void Clickonprofile()
	{
		Actions act=new Actions(dri);
		act.click(MyProfie).perform();
	}
	

}
