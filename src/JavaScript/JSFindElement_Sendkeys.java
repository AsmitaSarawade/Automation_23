package JavaScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSFindElement_Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com");
		//getElementById finds only one web element at time. other finds list of web Elements.
		((JavascriptExecutor)driver).executeScript("document.getElementById('email').value='Asmita@gmail.com'");
		//Thread.sleep(2000);
		//driver.close();
	

	}

}
