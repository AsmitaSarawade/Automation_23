package JavaScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSGetText_fromTExtFeild {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com");
		//getElementById finds only one web element at time. other finds list of web Elements.
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('email').value='Asmita@gmail.com'");
		String Text=(String) js.executeScript("return document.getElementById('email').value");
		System.out.println(Text);
		Thread.sleep(2000);
		driver.close();
	}

}
