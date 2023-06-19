package Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Select_india {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\revesion\\ScreenShots\\Before.jpg");
		FileHandler.copy(scr, dest);
		Thread.sleep(1000);
		Select sc=new Select(driver.findElement(By.xpath("//select")));
		sc.selectByValue("IND");
		Thread.sleep(1000);
		File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1=new File("D:\\revesion\\ScreenShots\\After.jpg");
		FileHandler.copy(scr1, dest1);
		driver.close();
	

	}

}
