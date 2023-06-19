package Scroll_with_javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_tutorialspoint_javascript_view {

	public static void main(String[] args) throws InterruptedException {
		
			      WebDriver driver = new ChromeDriver();
			      driver.get("https://www.tutorialspoint.com/index.htm");
			      driver.manage().window().maximize();
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			      // identify element
			      WebElement l=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
			     
			      // Javascript executor
			      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", l);
			     
			     // driver.quit();

	}

}
