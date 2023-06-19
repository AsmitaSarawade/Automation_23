package JavaScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	    //Click on radio button with getElementById and click
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,1600)");
		js.executeScript("document.getElementById('femalerb').click()");
		Thread.sleep(1000);
		//Click on list of checkbox with List collection and foreach using javascript
		List checkbox=(List)js.executeScript("return document.getElementsByName('language')");
		for(Object chb:checkbox)
		{
			js.executeScript("arguments[0].click()", chb);
		}
		Thread.sleep(1000);
		// click on button with javascripts getElementById and click
		js.executeScript("document.getElementById('clearbtn').click()");
		Thread.sleep(1000);
		  //Click on radio button with getElementById and click
		js.executeScript("document.getElementById('navigateHome').click()");
		Thread.sleep(1000);
		driver.close();

		
	}

}
