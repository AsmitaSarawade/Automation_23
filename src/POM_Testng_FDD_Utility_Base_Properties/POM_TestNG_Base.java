package POM_Testng_FDD_Utility_Base_Properties;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_TestNG_Base {
	WebDriver driver;
	public void StartBrowser() throws IOException
	{
		
		driver=new ChromeDriver();
		driver.get(Utility.getData("URL"));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}

}
