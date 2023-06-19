package Customized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customized_listbox_facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
   Thread.sleep(1000);
    Actions act=new Actions(driver);
    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
   
    act.click(month).perform();
    Thread.sleep(2000);
    act.sendKeys(Keys.HOME).perform();
    Thread.sleep(2000);
    for(int i=0;i<=10;i++)
    {
    act.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(2000);
    }
    act.sendKeys(Keys.ENTER).perform();
	}

}

