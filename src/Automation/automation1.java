package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println("URL of current web page is :"+url);
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().forward();
		String Title=driver.getTitle();
		System.out.println("Title of web page is :"+Title);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(4000);
		driver.get("https://instagram.com");
		String code=driver.getPageSource();
		String Title1=driver.getTitle();
		System.out.println("Title of web page is :"+Title1);
		//System.out.println("Source code of "+Title+ "  web page is: "+code);
		Thread.sleep(4000);
		driver.navigate().back();
		driver.close();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
