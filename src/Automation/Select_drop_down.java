package Automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_drop_down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("Https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		e.click();
		Thread.sleep(1000);
		Select s=new Select(driver.findElement(By.xpath("//select [@id='month']")));
		System.out.println(s.isMultiple());
		s.selectByIndex(1);
		ArrayList<String> ar=new ArrayList<String>();
		List<WebElement> l=s.getOptions();
		for(WebElement w:l)
		{
			String months=w.getText();
			System.out.println(w.getText());
			ar.add(months);
			
		}
		Collections.sort(ar);
		System.out.println(ar);
		driver.close();	
		
		

	}

}
