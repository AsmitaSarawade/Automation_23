import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class textcolour_tutorials {

	public static void main(String[] args) {
	
			     
			      WebDriver driver = new ChromeDriver();
			      String url = "https://www.tutorialspoint.com/index.htm";
			      driver.get(url);
			      driver.manage().window().maximize();
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			      //getting color attribute with getCssValue()
			      String rgbcolour = driver.findElement(By.xpath("//span[text()='Categories']")).getCssValue("color");
			      //getting background color attribute with getCssValue()
			      String hexcolor = Color.fromString(rgbcolour).asHex();
			      System.out.println(rgbcolour);
			      System.out.println(hexcolor);
			      
	}

}
