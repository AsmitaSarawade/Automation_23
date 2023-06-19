package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_amazon {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.amazon.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("D:\\revesion\\ScreenShots\\Sctrrnshot_amazon1.jpg");
		FileHandler.copy(src,Dest);
	}

}
