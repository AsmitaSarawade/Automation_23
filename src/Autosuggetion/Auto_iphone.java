package Autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_iphone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("iphone");
		
		Thread.sleep(1000);
		List<WebElement> liste= driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		String ex="iphone 14 pro max";
		String ex1="Mobile phone";
		for(WebElement li:liste)
		{
			String actual=li.getText();
			System.out.println(actual);
			Thread.sleep(1000);
			if(actual.equalsIgnoreCase(ex))
			{
				//if (actual.equalsIgnoreCase("Mobile phone"))
				li.click();
				break;
			}//bullet 350 
		}
	}

}
