package Autosuggetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_amazon_mens_shirts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mens shirt");
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		//System.out.println(list);
		String ex="mens shirts casual stylish summer";
		for(WebElement w:list)
		{
			String text=w.getText();
			System.out.println(text);
			Thread.sleep(1000);
			if(text.equalsIgnoreCase(ex))
			{
				w.click();
				break;
			}
		}

	}

}
