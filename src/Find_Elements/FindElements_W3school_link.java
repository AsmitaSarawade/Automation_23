package Find_Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_W3school_link {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		System.out.println(list.size());
		for(WebElement wb:list)
		{
			String text=wb.getText();
			System.out.println(text);
		}
	}

}
