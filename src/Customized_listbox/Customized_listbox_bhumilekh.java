package Customized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customized_listbox_bhumilekh {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bhulekh.mahabhumi.gov.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Thread.sleep(2000);
   WebElement city= driver.findElement(By.xpath("//select[@name='list']"));
   Actions act=new Actions(driver);
   act.click(city).perform();
   act.sendKeys(Keys.ARROW_DOWN);
   Thread.sleep(1000);
   act.sendKeys(Keys.ARROW_DOWN);
   driver.close();

	}

}
