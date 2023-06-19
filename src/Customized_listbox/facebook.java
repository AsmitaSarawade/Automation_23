package Customized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver ();
		 driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	WebElement allday = driver.findElement(By.xpath("//select[@id='day']"));
		
		Actions act=new Actions(driver);
		act.click(allday).perform();
		
		act.sendKeys(Keys.HOME).perform();
		for(int i=1;i<=18;i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);

	}
	}
}
