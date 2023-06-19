package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Flipkart {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.Flipkart.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("D:\\revesion\\ScreenShots\\Flipkart.jpg");
		FileHandler.copy(src,Dest);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement w=driver.findElement(By.xpath("//input[@type='text']"));
		w.sendKeys("Girls Watch with chain");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest1=new File("D:\\revesion\\ScreenShots\\Flipkart_watches.jpg");
		FileHandler.copy(src1,Dest1);

	

	}

}
