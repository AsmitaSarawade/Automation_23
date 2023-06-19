package Dyanmic_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Ratings {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi note 11");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String text=driver.findElement(By.xpath("(((//div[@class='_2kHMtA'])[1])//span)[6]")).getText();
		System.out.println(text);
	}

}
