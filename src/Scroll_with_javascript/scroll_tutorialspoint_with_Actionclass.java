package Scroll_with_javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll_tutorialspoint_with_Actionclass {

	public static void main(String[] args) throws InterruptedException {
	
			      WebDriver driver = new ChromeDriver();
			      driver.get("https://www.tutorialspoint.com/index.htm");
			      driver.manage().window().maximize();
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			      // identify element
			      WebElement l=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
			      
			      Actions a = new Actions(driver);
			      a.moveToElement(l).perform();
			      
			      //driver.quit();

	}

}
