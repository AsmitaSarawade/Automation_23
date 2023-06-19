import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_with_Javascript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='cat';",search);
		//((JavascriptExecutor)driver).executeScript("document.getElementById('APjFqb').value='rose'");
	
		
	}

}
