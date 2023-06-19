import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findout_colour_oftext {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement c=driver.findElement(By.xpath("//input[@type='text']"));
		c.sendKeys("asm.sarawade");
		String colour=c.getCssValue("colour");
		System.out.println(colour);
	}

}
