package Pop_ups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser_github {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	Set<String> allid=driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(allid);
	
	String childw=al.get(1);
	driver.switchTo().window(childw);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	String parentw=al.get(0);
	driver.switchTo().window(parentw);
	driver.findElement(By.xpath("//input[@value='New Window']")).click();
	driver.close();
	System.out.println("Closed the child browswe");
	driver.close();
	}

}
