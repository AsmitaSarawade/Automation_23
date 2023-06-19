package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class revision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		System.out.println("Title of current webpage is : "+driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().to("https://www.instagram.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.close();
	}

}
