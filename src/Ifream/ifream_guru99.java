package Ifream;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class ifream_guru99 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); //navigates to the Browser
	    driver.get("https://demo.guru99.com/test/guru99home/"); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e");
	       driver.findElement(By.xpath("html/body/a/img")).click();
	      // driver.switchTo().frame("google_ads_iframe_/24132379/guru99.com_300x250-2_0");
	       //String text=driver.findElement(By.xpath("//span[@class='ns-6ggo6-e-17']")).getText();
	      // System.out.println(text);
	}

}
