package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HD_wildsolus {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.wildsouls.gr");
		driver.findElement(By.xpath("//input[@id='m-email-mailchimp-email']")).sendKeys("asmitasarawade93@gmail.com");;
		
	}

}
