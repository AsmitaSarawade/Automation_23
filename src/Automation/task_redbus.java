package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class task_redbus {

		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.com");
			driver.manage().window().maximize();
			WebElement e=driver.findElement(By.xpath("//input[@class='sc-jlyJG kxRJeL']"));
			e.sendKeys("Pune");
			String value=e.getAttribute("value");
			System.out.println(value);
			driver.close();
		}


}
