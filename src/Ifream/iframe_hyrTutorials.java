package Ifream;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe_hyrTutorials {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//driver.switchTo().frame(1);
		//aswift_1
		//driver.findElement(By.xpath("//select[@id='selectnav1']")).click();
         driver.switchTo().frame("frm1");
        String text=driver.findElement(By.xpath("//h1[contains(text(),'HTML Dropdowns')]")).getText();
         System.out.println(text);
         driver.switchTo().parentFrame();
         String text1=driver.findElement(By.xpath("//div[@class='post-body entry-content'][1]")).getText();
	     System.out.println(text1);
	}
	

}
