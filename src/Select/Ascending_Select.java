package Select;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ascending_Select {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		WebElement month=d.findElement(By.xpath("//option[contains(text(),'Mobiles & Accessories')]"));
		//Thread.sleep(1000);
		//month.click();
		Select s=new Select(month);
		List<WebElement> list=s.getOptions();
		for(WebElement w:list)
		{
			System.out.println(w.getText());
		}
		
	
		

	}

}
