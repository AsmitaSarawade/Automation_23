package Dyanmic_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_tending {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("	https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']")).click();
	

	}

}
