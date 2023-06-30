package imp_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orangehrmlive_Dataprovider_excel_testclass {
	@Test(dataProvider = "loginData", dataProviderClass = orangehrmlive_Dataprovider_excel_DataClass.class)
	public void TestLogin(String userName, String password) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		Thread.sleep(1000);
		driver.quit();
	}
}
