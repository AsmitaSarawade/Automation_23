package Ifream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifream_w3school {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		//switch to frame with id
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		//Switch back to parent frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		//Switch to iframe with xpath
		 WebDriver we = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='3rd party ad content']")));
		 //Thread.sleep(1000);
		 we.findElement(By.xpath("//iframe[@title='3rd party ad content']")).click();
	

	}

}
