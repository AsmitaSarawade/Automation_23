package Autosuggetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_W3schools {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("search2")).sendKeys("SQL");
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='listofsearchresults']/a"));
		String ex="MySQL Tutorial";
		for(WebElement wb:list)
		{
			String actual=wb.getText();
			System.out.println(actual);
			if(actual.equalsIgnoreCase(ex))
			{
				wb.click();
				break;
			}
		}
		
				
				
				
				
				
				
				

	}

}
