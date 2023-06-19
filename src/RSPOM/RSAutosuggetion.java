package RSPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSAutosuggetion {
	@FindBy(xpath="//input[@id='autocomplete']") private WebElement select;
	@FindBy(xpath="//ul[@id='ui-id-1']") private WebElement allselect;
	
	 RSAutosuggetion(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	public void RSSendKeys()
	{
		select.sendKeys("ind" );
	}

}
