package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements_google_links {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		System.out.println("Links present in "+driver.getTitle()+" webpage is: "+list.size());
		for(WebElement s1:list)
		{
			System.out.println(s1.getText());
		}
		
		
		

	}

}
