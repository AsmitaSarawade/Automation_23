package RSPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RSRadiopage {

	public void RSSelectRadioPage(WebDriver driver) throws InterruptedException
	{
		List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement w:radio)
		{
			w.click();
			Thread.sleep(1000);
		}
	}

}
