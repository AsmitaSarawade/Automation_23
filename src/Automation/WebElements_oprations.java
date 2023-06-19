package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_oprations {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		boolean result=driver.findElement(By.xpath("//img[@class='_2xm1JU']")).isDisplayed();
		if(result)
		{
			System.out.println("Logo is present "+result);
		}
		else
		{
			System.out.println("Logo is not present");
		}
		

	}

}
