package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSWith_webdriverFindElements_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value=('Password')",pass);
		Thread.sleep(2000);
		driver.close();
	}

}
