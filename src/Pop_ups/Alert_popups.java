package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popups {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//getting text from alert popups
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		//Accepting the alert(ok button)
		driver.switchTo().alert().accept();
		//Accepting the another popup
		driver.switchTo().alert().accept();
		
	}

}
