package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_jira {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://id.atlassian.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("D:\\revesion\\ScreenShots\\Jira.jpg");
		FileHandler.copy(src,Dest);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("asmi.sarawade0@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
