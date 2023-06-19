package RSPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSCheckbox {
	@FindBy(xpath="//input[@id='checkBoxOption1']") private WebElement checkb1;
	@FindBy(xpath="//input[@id='checkBoxOption2']") private WebElement checkb2;
	@FindBy(xpath="//input[@id='checkBoxOption3']") private WebElement checkb3;
	
	RSCheckbox(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void RSClickCheckbox() 
	{
		
		checkb1.click();
		checkb2.click();
		checkb3.click();
		
	}
	

}
