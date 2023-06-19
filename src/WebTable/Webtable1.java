package WebTable;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	      driver.get("file:///D:/revesion/web2.html");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	}

}
