package RSPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		RSRadiopage obj=new RSRadiopage();
		obj.RSSelectRadioPage(driver);
		
		RSCheckbox obj1=new RSCheckbox(driver);
		obj1.RSClickCheckbox();
		
		RSAutosuggetion obj2=new RSAutosuggetion(driver);
		obj2.RSSendKeys();
	}
	
	
	

}
