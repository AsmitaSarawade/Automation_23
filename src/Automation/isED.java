package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isED {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			Thread.sleep(2000);
			WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
			un.sendKeys("xys");
			Thread.sleep(1000);
			un.clear();
			boolean result=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
			//System.out.println(result);
			if(result==true)
			{
				System.out.println("Button is enable");
			}
			else
			{
				System.out.println("Button is disable");
			}
			Thread.sleep(2000);
			String text=driver.findElement(By.xpath("//a[contains(text(),'Forgot ')]")).getText();
			System.out.println(text);
			driver.close();
	}

}
