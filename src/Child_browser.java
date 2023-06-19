import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.Flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()='Top Mirrorless Cameras']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(allid);
		String childid=a.get(1);
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("(//img[@class='q6DClP'])[4]")).click();

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
