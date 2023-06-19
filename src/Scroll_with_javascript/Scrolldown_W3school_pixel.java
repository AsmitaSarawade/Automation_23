package Scroll_with_javascript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_W3school_pixel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(2000);
		//ScrollDown(x,y)(0,value)
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1600)");
		Thread.sleep(2000);
		//Scrollup (x,y)(value,0)
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
		
	}

}
