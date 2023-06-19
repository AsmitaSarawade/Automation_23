import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");
		WebElement search=d.findElement(By.id("APjFqb"));
		search.sendKeys("rose");
		//d.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
		search.clear();
		search=d.findElement(By.name("q"));
		search.sendKeys("dog");
		Thread.sleep(2000);
		search.clear();
		search=d.findElement(By.className("gLFyf"));
		search.sendKeys("cat");
		Thread.sleep(2000);
		search.clear();
		search=d.findElement(By.tagName("textarea"));
		search.sendKeys("mango");
		Thread.sleep(2000);
		search.clear();
		
		
		
	}

}
