package Autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_bullet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("bullet 350");
		
		Thread.sleep(1000);
		List<WebElement> liste= driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		String ex="bullet 350 classic price in pune";
		for(WebElement li:liste)
		{
			String actual=li.getText();
			System.out.println(actual);
			Thread.sleep(1000);
			if(actual.equalsIgnoreCase(ex))
			{
				li.click();
				break;
			} 
		}

	}

}
