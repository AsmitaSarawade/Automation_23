package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class esp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.espncricinfo.com/");
		//driver.findElement(By.xpath("//div[@class='ds-relative ds-w-[288px] card scorecard'][1]"));
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Electronics']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[(text()='Electronics')]")).click();
		Thread.sleep(1000);
		String value=driver.findElement(By.xpath("//a[@title='Mobile Cables']")).getText();
		System.out.println(value);
	}

}
