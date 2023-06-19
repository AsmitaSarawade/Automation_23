package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_operation1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		boolean result=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		if(result)
		{
			System.out.println("Logo is present "+result);
		}
		else
		{
			System.out.println("Logo is not present");
		}
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
		Thread.sleep(2000);
		e.sendKeys("dog house");
		Thread.sleep(1000);
		System.out.println(e.getAttribute("value"));
		e.clear();
		Thread.sleep(1000);
		e.sendKeys("small girls dress");
		WebElement e1=driver.findElement(By.xpath("//input[@value='Go']"));
		e1.click();
		boolean select=driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox'][1]")).isSelected();
		WebElement s=driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox'][1]"));
		//s.click();
		Thread.sleep(1000);
		//s.clear();
		
		//driver.close();
		
		
		

	}

}
